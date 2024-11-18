package main.java.org.example;

// Description:
// https://leetcode.com/problems/break-a-palindrome/

public class BreakPalindrome {

    public String breakPalindrome(String palindrome) {
        int palindromeLength = palindrome.length();
        if (palindromeLength <= 1) {
            return "";
        }
        char[] letters = palindrome.toCharArray();
        int itrLength = (palindromeLength / 2) - 1;

        for (int i = 0; i <= itrLength; i++) {
            if (letters[i] != 'a') {
                letters[i] = 'a';
                return String.valueOf(letters);
            }
        }
        letters[palindromeLength - 1] = 'b';
        return String.valueOf(letters);
    }
}
