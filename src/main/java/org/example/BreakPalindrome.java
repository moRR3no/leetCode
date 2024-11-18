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
        boolean flagA = true;

        for (int i = 0; i < palindromeLength; i++) {
            if (letters[i] != 'a') {
                letters[i] = 'a';
                flagA = false;
                break;
            }
        }
        if (flagA) {
            letters[palindromeLength - 1] = 'b';
        }

        return String.valueOf(letters);
    }
}
