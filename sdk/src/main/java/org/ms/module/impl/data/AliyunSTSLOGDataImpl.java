package org.ms.module.impl.data;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.data.IAliyunSTSLogData;
import org.ms.module.supper.inter.data.IAliyunSTSLogDataAdapter;

public class AliyunSTSLOGDataImpl extends IAliyunSTSLogDataAdapter {


    private String access_key_id;
    private String access_key_secret;
    private String expiration;
    private String security;
    private String requestid;
    private boolean init;
    private boolean send=true;


    @Override
    public void setInit(boolean initStatus) {
        init =initStatus;
    }

    @Override
    public boolean getInit() {
        return init;
    }

    @Override
    public void setSend(boolean send) {
        this.send=send;

    }

    @Override
    public boolean send() {
        return send;
    }


    @Override
    public void setAccessKeySecret(String value) {
        this.access_key_secret=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "AccessKeySecret".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "AccessKeySecret".toLowerCase(), value);
    }
    @Override
    public String getAccessKeySecret() {
        if (access_key_secret != null && !"".equals(access_key_secret)) {
            return access_key_secret;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "AccessKeySecret".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "AccessKeySecret".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setAccessKeyId(String value) {
        this.access_key_id=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "AccessKeyId".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "AccessKeyId".toLowerCase(), value);
    }

    @Override
    public String getAccessKeyId() {
        if (access_key_id != null && !"".equals(access_key_id)) {
            return access_key_id;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "AccessKeyId".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "AccessKeyId".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setSecurity(String value) {
        this.security=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "Security".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "Security".toLowerCase(), value);
    }

    @Override
    public String getSecurity() {
        if (security != null && !"".equals(security)) {
            return security;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "Security".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "Security".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setExpiration(String value) {
        this.expiration=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "Expiration".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "Expiration".toLowerCase(), value);
    }

    @Override
    public String getExpiration() {
        if (expiration != null && !"".equals(expiration)) {
            return expiration;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "Expiration".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "Expiration".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setRequestid(String value) {
        this.requestid=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "Requestid".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "Requestid".toLowerCase(), value);
    }

    @Override
    public String getRequestid() {
        if (requestid != null && !"".equals(requestid)) {
            return requestid;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "Requestid".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "Requestid".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }
}
