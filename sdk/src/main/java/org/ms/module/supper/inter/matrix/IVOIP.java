package org.ms.module.supper.inter.matrix;

import org.ms.module.supper.inter.common.ICallBack;

public interface IVOIP {

    /**
     * GET /_matrix/client/r0/voip/turnServer
     */

    void getTurnServer(ICallBack callBack);

}
