package main.java.org.example;

// Description:
// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/description/

public class PairOfSongs {
    public int numPairsDivisibleBy60(int[] time) {

        int arrayLength = time.length;
        int count = 0;

        for (int i = 0; i < arrayLength - 1; i++) {

            for (int j = i + 1; j < arrayLength; j++) {
                System.out.println("Obecna para: " + time[i] + ", " + time[j]);
                int sum = time[i] + time[j];
                if (sum % 60 == 0) {
                    count++;
                    System.out.println("To ta para! \n");
                }
            }
        }
        return count;
    }
}
