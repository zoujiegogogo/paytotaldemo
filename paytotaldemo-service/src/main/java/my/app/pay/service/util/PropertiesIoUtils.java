package my.app.pay.service.util;


import my.app.pay.service.pojo.PropertiesEntityForUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.Properties;

public class PropertiesIoUtils {
    private static final Log log = LogFactory.getLog(PropertiesIoUtils.class);

    public static PropertiesEntityForUtil returnPropertiesList() {
        PropertiesEntityForUtil entity = null;
        try {
            InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("WxPay.properties");
            // 创建属性类对象map
            Properties properties = new Properties();
            // 加载
            properties.load(resourceAsStream);
            // 关闭流
            resourceAsStream.close();
            //通过key 获取value
            log.info("加载配置文件");
            String merchantNumber = properties.getProperty("wxpay.mch-id");
            String merchantAPICertificateSerialNumber = properties.getProperty("wxpay.mch-serial-no");
            String merchantPrivateKeyFile = properties.getProperty("wxpay.private-key-path");
            String apiKey = properties.getProperty("wxpay.api-v3-key");
            String APPID = properties.getProperty("wxpay.appid");
            String wechatServerAddress = properties.getProperty("wxpay.domain");
            String receivingResultNotificationAddress = properties.getProperty("wxpay.notify-domain");
            log.info("添加并返回实体类");
            entity = new PropertiesEntityForUtil();
            entity.setMerchantNumber(merchantNumber);
            entity.setMerchantAPICertificateSerialNumber(merchantAPICertificateSerialNumber);
            entity.setMerchantPrivateKeyFile(merchantPrivateKeyFile);
            entity.setApiKey(apiKey);
            entity.setAPPID(APPID);
            entity.setWechatServerAddress(wechatServerAddress);
            entity.setReceivingResultNotificationAddress(receivingResultNotificationAddress);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return entity;
    }
}
