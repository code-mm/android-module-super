package org.ms.module.supper.inter.utils;


import org.ms.module.supper.inter.supper.ISupper;

import java.util.List;
import java.util.Map;

public interface ISystemUtils  extends ISupper {

    boolean isMobilePhone();

    String getIp();

    String getImei();

    String getAndroidId();

    String getUmid();

    String getMac();

    String getIpV6();

    //获取用户手机上已经安装的非系统自带APP列表
    List<Map<String, String>> getAppList();

    //获取正在运行的应用程序 

    List<Map<String, String>> getRunningProcess();


    String getCpuName();

    String printResolution();

    String getCpuAbi();

    String getProduct();

    String getOsType();

    String getOSVersion();

    String getBrand();

    String getSSID();

    String getCurrentLanguage();

    String adCode();


    String getCurrentTimeZone();


    String getNetWorkTypeName();



}
