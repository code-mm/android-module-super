package org.ms.module.supper.inter.matrix;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.supper.ISupper;

import java.util.List;
import java.util.Map;

public interface IMatrix extends ISupper {

    // 设置HomeServer
    void setHomeServer(String server);

    // 获取服务器
    String getHomeServer();

    // 登录
    void login(String username, String password, ICallBack callBack);

    // 注册
    void register(String username, String password, ICallBack callBack);


    // 添加最近房间列表
    void addRecentRooms(String roomId);

    // 最近房间列表
    List<String> recentRooms();


    // 直接聊天
    List<Map<String, String>> direct();

    // 添加直接聊天
    void addDirect(Map<String, String> direct);

    // 同步
    void sync(
            String access_token,
            String filter,
            String since,
            boolean full_state,
            String set_presence,
            int timeout,
            ICallBack callBack);


    // 开始同步
    void startSync();
}
