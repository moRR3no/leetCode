package main.java.org.example;

// Description:
// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortIntegersByBits {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Comparator<Integer> comparator = new CustomComparator();
        Arrays.sort(boxedArray, comparator);
        return arr;
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        int countA = Integer.bitCount(a);
        int countB = Integer.bitCount(b);

        if (countA == countB) {
            return Integer.compare(a,b);
        } else {
            return Integer.compare(countA, countB);
        }
    }
}
