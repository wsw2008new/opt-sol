package com.ai.opt.sol.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.ai.paas.ipaas.util.StringUtil;
import com.ai.runner.apicollector.util.ElasticSearchHandler;
import com.ai.runner.apicollector.vo.ESConfig;

public final class APIESProcessor {

    private static ElasticSearchHandler ESHANDLER = null;

    private static final String ES_CONFIG = "context/esconfig.properties";

    private APIESProcessor() {
        // 禁止实例化
    }

    public static ElasticSearchHandler getElasticSearchHandler() {
        if (ESHANDLER == null) {
            synchronized (ElasticSearchHandler.class) {
                if (ESHANDLER == null) {
                    ESConfig esconfig = loadESConfig();
                    ESHANDLER = new ElasticSearchHandler(esconfig);
                }
            }
        }
        return ESHANDLER;

    }

    private static ESConfig loadESConfig() {
        InputStream is = APIESProcessor.class.getClassLoader().getResourceAsStream(ES_CONFIG);
        Properties prop = new Properties();
        try {
            prop.load(is);
        } catch (IOException e) {
            throw new RuntimeException("loding esconfig file failed", e);
        }
        String host = prop.getProperty("host");
        String port = prop.getProperty("port");
        String clusterName = prop.getProperty("clusterName");
        if (StringUtil.isBlank(host)) {
            throw new RuntimeException("esconfig missing host");
        }

        if (StringUtil.isBlank(port)) {
            throw new RuntimeException("esconfig missing port");
        }

        if (StringUtil.isBlank(clusterName)) {
            throw new RuntimeException("esconfig missing clusterName");
        }
        ESConfig esconfig = new ESConfig();
        esconfig.setIp(host);
        esconfig.setPort(Integer.parseInt(port));
        esconfig.setClusterName(clusterName);
        return esconfig;
    }

    public static void main(String[] agrs) {
        ElasticSearchHandler handler = null;
        for (int i = 0; i < 100; i++) {
            handler = APIESProcessor.getElasticSearchHandler();
            System.out.println(handler.toString());
        }

    }

}
