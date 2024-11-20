package main.java.org.example.sortingAlgo;

// Quick Sort algorithm
public class QuickSort {

    public void quickSort(int[] arr, int lowIndex, int highIndex) {

        // in the first place we have to check if it is not a one element array, if it is -> it's already sorted
        // and do nothing
        if (lowIndex >= highIndex) {
             return;
        }

        // firstly, choose a pivot which is the reference to further sorting
        // it can't be always highIndex as a pivot when we recursively use method, so
        // highIndex as a parameter is a must
        int pivot = arr[highIndex];

        // initialize leftPointer and rightPointer to use it in while loop
        int leftPointer = lowIndex, rightPointer = highIndex;

        // loop till left pointer and right pointer hit each other
        while (leftPointer < rightPointer) {

            // another loop to find number higher than the pivot or hit the rightPointer
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // another loop to find number lower than the pivot or hit the leftPointer
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // we have indexes of two numbers: higher than the pivot and lower than the pivot -> swap it
            swap(arr, leftPointer, rightPointer);
        }
        // when both pointers meet -> swap number of index pointers and change it with pivot index (which is highIndex)
        swap(arr, leftPointer, highIndex);

        // now we execute method recursively to the left half (lower one), so lowIndex is still lowIndex and
        // the highIndex is index where pointers meet minus one, because we have already swapped at this meeting point
        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, lowIndex + 1, highIndex);
    }

    private static void swap (int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}