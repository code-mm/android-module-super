package com.ms.module.impl.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.net.INetStatusChange;


public class NetWorkChangReceiver extends BroadcastReceiver implements INetStatusChange {


    private static final String TAG = "NetWorkChangReceiver";

    @Override
    public void listener(ICallBack callBack) {
        setNetWorkChange(new NetWorkChange() {
            @Override
            public void netWorkChange(NETTYPE nettype, boolean conn) {
                if (callBack != null) {
                    callBack.onChange(nettype.name() + "," + conn);
                }
            }
        });
    }

    // 网络变化接口
    public interface NetWorkChange {
        void netWorkChange(NETTYPE nettype, boolean conn);
    }

    // 网络类型
    public enum NETTYPE {
        WIFI,
        MOBILE
    }

    // 回调的接口
    private NetWorkChange netWorkChange;

    // 设置回调接口
    public void setNetWorkChange(NetWorkChange netWorkChange) {
        this.netWorkChange = netWorkChange;
    }

    /**
     * 获取连接类型
     *
     * @param type
     * @return
     */
    private NETTYPE getConnectionType(int type) {
        NETTYPE nettype = NETTYPE.MOBILE;
        if (type == ConnectivityManager.TYPE_MOBILE) {
            nettype = NETTYPE.MOBILE;
        } else if (type == ConnectivityManager.TYPE_WIFI) {
            nettype = NETTYPE.WIFI;
        }
        return nettype;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: ");
        if (WifiManager.WIFI_STATE_CHANGED_ACTION.equals(intent.getAction())) {// 监听wifi的打开与关闭，与wifi的连接无关
            int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, 0);
            Log.e(TAG, "wifiState:" + wifiState);
            switch (wifiState) {
                case WifiManager.WIFI_STATE_DISABLED:
                    break;
                case WifiManager.WIFI_STATE_DISABLING:
                    break;
            }
        }
        // 监听网络连接，包括wifi和移动数据的打开和关闭,以及连接上可用的连接都会接到监听
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            //获取联网状态的NetworkInfo对象
            NetworkInfo info = intent.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);
            if (info != null) {
                //如果当前的网络连接成功并且网络连接可用
                if (NetworkInfo.State.CONNECTED == info.getState() && info.isAvailable()) {
                    if (info.getType() == ConnectivityManager.TYPE_WIFI || info.getType() == ConnectivityManager.TYPE_MOBILE) {
                        if (netWorkChange != null) {
                            netWorkChange.netWorkChange(getConnectionType(info.getType()), true);
                        }
                    }
                } else {
                    if (netWorkChange != null) {
                        netWorkChange.netWorkChange(getConnectionType(info.getType()), false);
                    }
                }
            }
        }
    }
}