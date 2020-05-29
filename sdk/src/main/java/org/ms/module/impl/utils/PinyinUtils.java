package org.ms.module.impl.utils;

import com.github.promeg.pinyinhelper.Pinyin;

import org.ms.module.supper.inter.utils.IPinyinUtilsAdapter;


/**
 * Created by maohuawei on 2018/2/5.
 */

public class PinyinUtils extends IPinyinUtilsAdapter {

    /**
     * 汉字拼音
     *
     * @param hanzi
     * @return
     */
    public String hanZi2Pinyin(String hanzi) {

        if (hanzi == null) {
            throw new NullPointerException("hanzi null");
        }
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = hanzi.toCharArray();

        for (char c : chars) {
            if (Character.isWhitespace(c)) {
                continue;
            }

            if (c > 127) {

                String s = Pinyin.toPinyin(c);
                stringBuilder.append(s);

            } else {

                stringBuilder.append(c);
            }

        }
        return stringBuilder.toString();
    }
}