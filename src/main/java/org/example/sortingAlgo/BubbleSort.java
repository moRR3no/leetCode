package main.java.org.example.sortingAlgo;

// Bubble sort algorithm

public class BubbleSort {

    public void sort(int[] arr) {

        int length = arr.length;
        int k = 1;
        boolean flag = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[k]) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                flag = true;
            }
            k++;
        }
        if (flag) {
            sort(arr);
        }
    }
}
