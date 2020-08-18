package com.ms.module.supers.inter.utils;

import java.util.List;

public class IRegexUtilsAdapter implements IRegexUtils {
    @Override
    public boolean isMobileSimple(CharSequence input) {
        return false;
    }

    @Override
    public boolean isMobileExact(CharSequence input) {
        return false;
    }

    @Override
    public boolean isTel(CharSequence input) {
        return false;
    }

    @Override
    public boolean isIDCard15(CharSequence input) {
        return false;
    }

    @Override
    public boolean isIDCard18(CharSequence input) {
        return false;
    }

    @Override
    public boolean isEmail(CharSequence input) {
        return false;
    }

    @Override
    public boolean isURL(CharSequence input) {
        return false;
    }

    @Override
    public boolean isZh(CharSequence input) {
        return false;
    }

    @Override
    public boolean isUsername(CharSequence input) {
        return false;
    }

    @Override
    public boolean isDate(CharSequence input) {
        return false;
    }

    @Override
    public boolean isIP(CharSequence input) {
        return false;
    }

    @Override
    public boolean isMatch(CharSequence input) {
        return false;
    }

    @Override
    public List<String> getMatches(String regex, CharSequence input) {
        return null;
    }

    @Override
    public String[] getSplits(String input, String regex) {
        return new String[0];
    }

    @Override
    public String getReplaceFirst(String input, String regex, String replacement) {
        return null;
    }

    @Override
    public String getReplaceAll(String input, String regex, String replacement) {
        return null;
    }

    @Override
    public boolean isContainChinese(String s) {
        return false;
    }

    @Override
    public boolean isStartWithNumber(String str) {
        return false;
    }

    @Override
    public boolean isContainsStr(String str) {
        return false;
    }
}
