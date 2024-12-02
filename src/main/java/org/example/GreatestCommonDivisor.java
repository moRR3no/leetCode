package main.java.org.example;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class GreatestCommonDivisor {

    public String gcdOfStrings(String str1, String str2) {
        int str2Length = str2.length();
        int str1Length = str1.length();
        int commonLength = greatestDivisor(str1Length, str2Length);

        String firstPref = str1.substring(0, commonLength);
        String secPref = str2.substring(0, commonLength);

        if (!firstPref.equals(secPref)) {
            return "";
        }

        int tempLength = commonLength;
        for (int i = commonLength; i <= str1Length; i+=commonLength) {
            if (!str1.substring(i - commonLength, tempLength).equals(firstPref)) {
                return "";
            }
            tempLength += commonLength;
        }

        tempLength =commonLength;
        for (int i = commonLength; i <= str2Length; i+=commonLength) {
            if (!str2.substring(i - commonLength, tempLength).equals(secPref)) {
                return "";
            }
            tempLength += commonLength;
        }
        return secPref;
    }

    private int greatestDivisor (int a, int b) {
        int length;
        int greatestDivisor = 1;
        if (a > b) {
            length = b;
        } else {
            length = a;
        }
        for (int i = 2; i <= length; i++) {
            if (a % i == 0 && b % i == 0) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }
}
