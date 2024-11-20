package main.java.org.example.sortingAlgo;

//
public class MergeSort {

    public void mergeSort(int[] arr) {
        int arrLength = arr.length;

        // jeśli dana tabela ma mniej niz dwa elementy (0 , 1) to nic nie rob (return)
        if (arrLength < 2) {
            return;
        }

        // dzielimy tabelę na dwie podtabele
        // jesli dlugosc tabeli = 9, to: leftHalf=4, rightHalf=5
        int midIndex = arrLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLength - midIndex];

        // mamy puste dwie tabele, więc trzeba je zapełnić, zarówno dla lewej jak i prawej tabeli
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = midIndex; i < arrLength; i++) {
            rightHalf[i - midIndex] = arr[i]; //i-minIndex dlatego, ze chcemy zapelniac tabele od poczatku, czyli od idx=0
        }

        // teraz stosujemy rekurencje i wywołujemy metode sama w sobie
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // dojdziemy do tego stanu gdzie bedą jednoelementowe tabele - na tym kończy sie divide step

        // teraz conquer
        merge(arr, leftHalf, rightHalf);

    }

    private static void merge(int[] intArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // i for leftHalf, j for rightHalf, k for mergedArray
        int i = 0, j = 0, k = 0;

        // looping till we are out of elements in both arrays
        // we r checking first element of leftHalf with first element of rightHalf and then fit in the right condition
        // add it to merge table, increment in merge table and then go to check the next position of subarray
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                intArray[k] = leftHalf[i];
                i++;
            } else {
                intArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // it goes then to situation where we're out of elements in one of arrays -> exit the loop, but other array
        // is not out of elements -> we have to loop for the remaining elements (it can be leftHalf or rightSize)
        while (i < leftSize) { // left half is not out of elements
            intArray[k] = leftHalf[i];
            i++;
            k++;
        }

        // same for rightSize
        while (j < rightSize) { // left half is not out of elements
            intArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }


}
