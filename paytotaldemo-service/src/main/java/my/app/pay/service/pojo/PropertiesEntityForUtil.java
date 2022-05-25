package my.app.pay.service.pojo;

public class PropertiesEntityForUtil {
    public PropertiesEntityForUtil() {
    }

    private String merchantNumber;
    private String merchantAPICertificateSerialNumber;
    private String merchantPrivateKeyFile;
    private String apiKey;
    private String APPID;
    private String wechatServerAddress;

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    public void setMerchantAPICertificateSerialNumber(String merchantAPICertificateSerialNumber) {
        this.merchantAPICertificateSerialNumber = merchantAPICertificateSerialNumber;
    }

    public void setMerchantPrivateKeyFile(String merchantPrivateKeyFile) {
        this.merchantPrivateKeyFile = merchantPrivateKeyFile;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public void setWechatServerAddress(String wechatServerAddress) {
        this.wechatServerAddress = wechatServerAddress;
    }

    public void setReceivingResultNotificationAddress(String receivingResultNotificationAddress) {
        this.receivingResultNotificationAddress = receivingResultNotificationAddress;
    }

    private  String receivingResultNotificationAddress;

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public String getMerchantAPICertificateSerialNumber() {
        return merchantAPICertificateSerialNumber;
    }

    public String getMerchantPrivateKeyFile() {
        return merchantPrivateKeyFile;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getAPPID() {
        return APPID;
    }

    public String getWechatServerAddress() {
        return wechatServerAddress;
    }

    public String getReceivingResultNotificationAddress() {
        return receivingResultNotificationAddress;
    }

    public PropertiesEntityForUtil(String merchantNumber, String merchantAPICertificateSerialNumber, String merchantPrivateKeyFile, String apiKey, String appid, String wechatServerAddress, String receivingResultNotificationAddress) {
        this.merchantNumber = merchantNumber;
        this.merchantAPICertificateSerialNumber = merchantAPICertificateSerialNumber;
        this.merchantPrivateKeyFile = merchantPrivateKeyFile;
        this.apiKey = apiKey;
        APPID = appid;
        this.wechatServerAddress = wechatServerAddress;
        this.receivingResultNotificationAddress = receivingResultNotificationAddress;
    }
}
