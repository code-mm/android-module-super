package org.ms.module.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.ms.module.supper.inter.utils.IDownLoadUtils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadUtils implements IDownLoadUtils {


    private static final DownloadUtils mDownloadUtils = new DownloadUtils();

    public static DownloadUtils getInstance() {
        return mDownloadUtils;
    }

    @Override
    public Bitmap getURLimage(String s) {
        Bitmap bmp = null;
        try {
            URL myurl = new URL(s);
            // 获得连接
            HttpURLConnection conn = (HttpURLConnection) myurl.openConnection();
            conn.setConnectTimeout(6000);//设置超时
            conn.setDoInput(true);
            conn.setUseCaches(false);//不缓存
            conn.connect();
            InputStream is = conn.getInputStream();//获得图片的数据流
            bmp = BitmapFactory.decodeStream(is);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bmp;
    }
}
