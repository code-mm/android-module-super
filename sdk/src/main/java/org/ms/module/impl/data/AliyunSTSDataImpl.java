package org.ms.module.impl.data;

import org.ms.module.supper.inter.data.IAliyunSTSData;
import org.ms.module.supper.inter.data.IAliyunSTSDataAdapter;
import org.ms.module.supper.inter.data.IAliyunSTSLogData;
import org.ms.module.supper.inter.data.IAliyunSTSOSSData;

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
