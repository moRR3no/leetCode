package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/first-unique-character-in-a-string/

public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        if (s.length()==1) {
            return 0;
        }
        List<Character> repeatedChars = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (repeatedChars.contains(chars[i])) {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    repeatedChars.add(chars[i]);
                    break;
                }
            }
            if (!repeatedChars.contains(chars[i])) {
                return i;
            }
        }
        return -1;
    }
}
