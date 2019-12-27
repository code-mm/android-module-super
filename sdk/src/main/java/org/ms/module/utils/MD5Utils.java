package org.ms.module.utils;

import org.ms.module.supper.inter.utils.IMD5Utils;

import java.security.MessageDigest;

/**
 * @author maohuawei created in 2018/10/8
 * <p>
 * MD5 工具类
 */
public class MD5Utils implements IMD5Utils {


    private static MD5Utils md5Utils = new MD5Utils();

    public static MD5Utils getInstance() {
        return md5Utils;
    }



    private static char hexDigits[] =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                    'e', 'f'};

    /**
     * 返回md5值
     *
     * @param key
     * @return
     */
    public  String md5(String key) {

        try {
            byte[] btInput = key.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }
}