package com.prituladima.lessons.git_in_action;

import java.util.HashMap;
import java.util.Map;

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
        final Map <Character, Integer> charCnt = new HashMap<>();
       char mostRepChar = '\0';
       int maxCnt = 0;
        for(int i = 0 ; i < val.length(); i++) {
            char curChar = val.charAt(i);
            charCnt.merge(curChar, 1, Integer::sum);
            if(maxCnt < charCnt.get(curChar)){
                maxCnt = charCnt.get(curChar);
                mostRepChar = curChar;
            }
        }

        return mostRepChar;
    }

}
