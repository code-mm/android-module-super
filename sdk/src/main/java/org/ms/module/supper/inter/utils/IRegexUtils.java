package org.ms.module.supper.inter.utils;

import java.util.List;

public interface IRegexUtils {


    boolean isMobileSimple(final CharSequence input);

    boolean isMobileExact(final CharSequence input);

    boolean isTel(final CharSequence input);

    boolean isIDCard15(final CharSequence input);

    boolean isIDCard18(final CharSequence input);

    boolean isEmail(final CharSequence input);

    boolean isURL(final CharSequence input);

    boolean isZh(final CharSequence input);

    boolean isUsername(final CharSequence input);

    boolean isDate(final CharSequence input);

    boolean isIP(final CharSequence input);

    boolean isMatch(final CharSequence input);

    List<String> getMatches(final String regex, final CharSequence input);

    String[] getSplits(final String input, final String regex);

    String getReplaceFirst(final String input,
                           final String regex,
                           final String replacement);

    String getReplaceAll(final String input,
                         final String regex,
                         final String replacement);


    boolean isContainChinese(String s);

}
