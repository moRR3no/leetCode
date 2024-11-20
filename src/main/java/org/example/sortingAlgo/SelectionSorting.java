package main.java.org.example.sortingAlgo;

//sorting algorithm

public class SelectionSorting {

    public void sort (int[] arr) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrLength; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
