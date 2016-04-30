package com.ai.opt.sol.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.ai.paas.ipaas.util.StringUtil;
import com.ai.runner.apicollector.util.ElasticSearchHandler;
import com.ai.runner.apicollector.vo.ESConfig;

public final class APIESProcessor {

    private static APIESProcessor INSTANCE = null;

    private static final String ES_CONFIG = "context/esconfig.properties";

    private ESConfig esconfig = null;

    private APIESProcessor() {
        // 禁止实例化
    }

    /**
     * 获取配置加载器单例实例，确保多线程并发情况下高效读取，避免INSTANCE引用指向不同的实例对象
     * 
     * @return
     * @author zhangchao
     */
    public static APIESProcessor getInstance() {
        if (INSTANCE == null) {
            synchronized (APIESProcessor.class) {
                if (INSTANCE == null) {
                    INSTANCE = new APIESProcessor();
                    INSTANCE.loadESConfig();
                }
            }
        }
        return INSTANCE;

    }

    private void loadESConfig() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(
                ES_CONFIG);
        Properties prop = new Properties();
        try {
            prop.load(is);
        } catch (IOException e) {
            throw new RuntimeException("loding esconfig file failed", e);
        }
        String host = prop.getProperty("host");
        String port = prop.getProperty("port");
        if (StringUtil.isBlank(host)) {
            throw new RuntimeException("esconfig missing host");
        }

        if (StringUtil.isBlank(port)) {
            throw new RuntimeException("esconfig missing port");
        }
        esconfig = new ESConfig();
        esconfig.setIp(host);
        esconfig.setPort(Integer.parseInt(port));
    }

    /**
     * 获取搜索器
     * 
     * @return
     * @author zhangchao
     */
    public ElasticSearchHandler getElasticSearchHandler() {
        ElasticSearchHandler searcher = new ElasticSearchHandler(esconfig);
        return searcher;
    }
    
    public static void main(String[] agrs){
        APIESProcessor.getInstance().getElasticSearchHandler();
    }

}
