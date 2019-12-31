package org.ms.module.supper.inter.matrix;


import org.ms.module.supper.inter.common.ICallBack;

public interface IServerAdministration {
    /**
     * 获取有关域的Matrix服务器发现信息。
     */
    void client(ICallBack callBack);

    /**
     * 获取有关特定用户的信息
     * @param userId
     */
    void whois(String userId , ICallBack callBack);

    /**
     *
     */
    void versions(ICallBack callBack);
}