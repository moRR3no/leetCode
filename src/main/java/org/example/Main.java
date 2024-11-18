package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        // Here use one of the LeetCode solutions from 'org.example' catalog, f.e. - PairOfSongs
        PairOfSongs pairOfSongs = new PairOfSongs();
        int[] arr = {20,30,40,50,60,60};
        System.out.println(pairOfSongs.numPairsDivisibleBy60(arr));
    }
}