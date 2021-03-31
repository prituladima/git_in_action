package com.prituladima.lessons.git_in_action;

public class StringUtil {

    public static void main(String[] args) {
        System.out.println(repeatAndJoin("hello", 10, ", "));
    }

    public static String repeatAndJoin(String val, int cnt, String separator) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            stringBuilder.append(val);
            if (i < cnt - 1) {
                stringBuilder.append(separator);
            }
        }
        return stringBuilder.toString();
    }

    public char mostRepeatingChar(String val){
        return '\0';
    }

}
