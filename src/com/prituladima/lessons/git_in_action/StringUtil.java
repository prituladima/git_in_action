package com.prituladima.lessons.git_in_action;

import java.util.HashMap;
import java.util.Map;

public class StringUtil {

    public String repeatAndJoin(String val, int cnt, String separator){
        return "";
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
