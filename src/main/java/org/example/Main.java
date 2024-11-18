package main.java.org.example;

import main.java.org.example.PairOfSongs;

public class Main {
    public static void main(String[] args) {
        PairOfSongs pairOfSongs = new PairOfSongs();

        int[] arr = {20,30,40,50,60,60};


        System.out.println(pairOfSongs.numPairsDivisibleBy60(arr));
    }
}