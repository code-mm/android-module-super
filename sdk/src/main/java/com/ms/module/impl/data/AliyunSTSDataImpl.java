package com.ms.module.impl.data;

import com.ms.module.supers.inter.data.IAliyunSTSDataAdapter;
import com.ms.module.supers.inter.data.IAliyunSTSLogData;
import com.ms.module.supers.inter.data.IAliyunSTSOSSData;

public class AliyunSTSDataImpl extends IAliyunSTSDataAdapter {

    @Override
    public IAliyunSTSLogData getAliyunSTSLogData() {
        return new AliyunSTSLOGDataImpl();
    }

    @Override
    public IAliyunSTSOSSData getAliyunSTSOSSData() {
        return new AliyunSTSOSSDataImpl();
    }
}
