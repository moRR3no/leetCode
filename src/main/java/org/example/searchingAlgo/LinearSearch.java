package main.java.org.example.searchingAlgo;

// linear search algorithm

public class LinearSearch {

    public int search(int a, int[] arr) {
        for (int j : arr) {
            if (j == a) {
                return a;
            }
        }
        return -1;
    }
}
