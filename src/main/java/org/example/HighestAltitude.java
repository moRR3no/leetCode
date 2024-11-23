package main.java.org.example;

// https://leetcode.com/problems/find-the-highest-altitude

public class HighestAltitude {

    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxAlt = sum;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (sum > maxAlt) {
                maxAlt = sum;
            }
        }
        return maxAlt;
    }

}
