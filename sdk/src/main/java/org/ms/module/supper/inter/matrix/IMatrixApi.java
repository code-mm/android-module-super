package org.ms.module.supper.inter.matrix;

import org.ms.module.supper.inter.supper.ISupper;

public interface IMatrixApi  extends ISupper {

    IServerAdministration getServerAdministration();
    IUserData getUserData();
    ICapabilities getCapabilities();
    IRoomCreation getRoomCreation();
    IDeviceManagement getDeviceManagement();
    IApplicationServiceRoomDirectoryManagement getApplicationServiceRoomDirectoryManagement();
    IRoomDirectory getRoomDirectory();
    IRoomParticipation getRoomParticipation();
    IRoomMembership getRoomMembership();
    IEndToEndEncryption getEndToEndEncryption();
    ISessionManagement getSessionManagement();
    IPushNotifications getPushNotifications();
    IPresence getPresence();
    IRoomDiscovery getRoomDiscovery();
    IReadMarkers getReadMarkers();
    IReportingContent getReportingContent();
    IRoomUpgrades getRoomUpgrades();
    ISearch getSearch();
    ISendToDeviceMessaging getSendToDeviceMessaging();
    IOpenID getOpenId();
    IVOIP getVoIP();
    IMedia getMedia();

}
