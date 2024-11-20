package main.java.org.example.sortingAlgo;


// sorting playground
public class Sort {

    private static void merge(int[] concatArr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                concatArr[k] = leftHalf[i];
                i++;
            } else {
                concatArr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            concatArr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            concatArr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr) {
        int arrLength = arr.length;

        if (arrLength < 2) {
            return;
        }

        int midIndex = arrLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = midIndex; i < arrLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        // divideEtap -> now conquerEtap
        // merge tabel jednoelementowych
        merge(arr, leftHalf, rightHalf);

    }

    public void selectionSort(int[] arr) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrLength; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
