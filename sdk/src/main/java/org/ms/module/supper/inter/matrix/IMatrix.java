package org.ms.module.supper.inter.matrix;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.supper.ISupper;

import java.util.List;
import java.util.Map;

/**
 * api 文档地址
 * https://matrix.org/docs/spec/client_server/latest#m-room-aliases
 */
public interface IMatrix extends ISupper {
    // 设置HomeServer
    void setHomeServer(String server);

    // 获取服务器
    String getHomeServer();

    // 获取服务器版本
    void getVersion(ICallBack callBack);

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


    //9.5获取房间的事件
    //9.5.1    GET / _matrix / client / r0 / rooms / {roomId} / event / {eventId}
    //根据roomId / eventId获取一个事件。您必须具有检索此事件的权限，例如，成为该事件会议室的成员。
    void roomIdAndEventIdByRoomEvent(String roomId, String eventId, ICallBack callBack);

    //9.5.2    GET / _matrix / client / r0 / rooms / {roomId} / state / {eventType} / {stateKey}
    //在房间中查找状态事件的内容。如果用户加入了会议室，则从会议室的当前状态获取状态。如果用户已离开房间，则从他们离开时的房间状态开始获取状态。
    void roomIdAndEventTypeAndStateKeyByRoomEvent(String roomId, String eventType, String stateKey, ICallBack callBack);

    //9.5.3    GET / _matrix / client / r0 / rooms / {roomId} /状态
    //获取房间当前状态的状态事件。
    void roomIdByRoomStatus(String roomId, ICallBack callBack);


    // 9.5.4   GET /_matrix/client/r0/rooms/{roomId}/members
    // Get the list of members for this room.
    // 获取房间成员
    void roomIdByMembers(String roomId, ICallBack callBack);


    //    9.5.5    GET / _matrix / client / r0 / rooms / {roomId} / joined_members
//此API将MXID的映射返回到会议室成员的成员信息对象。当前用户必须在会议室中才能正常工作，除非它是应用程序服务，在这种情况下，任何AS的用户都必须在会议室中。此API主要用于应用程序服务，并且应比/ members更快地响应，因为它可以在服务器上更有效地实现。
    void roomIdByJoinedMembers(String roomId, ICallBack callBack);


    //    9.5.6    GET / _matrix / client / r0 / rooms / {roomId} /消息
//    此API返回房间的消息和状态事件列表。它使用分页查询参数对房间中的历史进行分页。
    void roomIdByMessage(String roomId, ICallBack callBack);


    //创建房间
//    10.1.1    POST / _matrix / client / r0 / createRoom
//    {
//  "creation_content": {
//    "m.federate": false
//  },
//  "name": "The Grand Duke Pub",
//  "preset": "public_chat",
//  "room_alias_name": "thepub",
//  "topic": "All about happy hour"
//}
    void createRoom(String name, ICallBack callBack);

}

