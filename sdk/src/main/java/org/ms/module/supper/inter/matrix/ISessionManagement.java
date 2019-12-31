package org.ms.module.supper.inter.matrix;

import org.json.JSONObject;
import org.ms.module.supper.inter.common.ICallBack;

public interface ISessionManagement {


    /**
     * Session managementShow/HideList OperationsExpand Operations
     * GET /_matrix/client/r0/login
     * Get the supported login types to authenticate users
     * // 获取支持的登录验证方式
     */
    void getLoginType(ICallBack callBack);


    /**
     * POST /_matrix/client/r0/login
     * Authenticates the user.
     */

    void login(JSONObject jsonObject, ICallBack callBack);

    /**
     *    POST /_matrix/client/r0/logout
     *     Invalidates a user access token
     */

    /**
     *
     POST /_matrix/client/r0/logout/all
     Invalidates all access tokens for a user
     */


}
