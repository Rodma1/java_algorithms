package 字符串;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _520_检测大写字母 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Dddd"));
    }
    private static boolean detectCapitalUse(String word) {
        System.out.println(word);
//        通过正则匹配

        return word.matches("^([A-Z]?[a-z]+|[A-Z]+)$");
    }
}
