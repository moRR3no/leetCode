package main.java.org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/find-the-difference-of-two-arrays

public class TwoArraysDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> list1 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i : nums2) {
            list2.add(i);
        }

        for (int i : list1) {
            if (!list2.contains(i)) {
                set1.add(i);
            }
        }
        for (int i : list2) {
            if (!list1.contains(i)) {
                set2.add(i);
            }
        }
        list1.clear();
        list1.addAll(set1);
        list2.clear();
        list2.addAll(set2);
        List<List<Integer>> returnList = new ArrayList<>();
        returnList.add(list1);
        returnList.add(list2);
        return returnList;
    }

    public List<List<Integer>> findDifferenceBetterSolution (int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Populate the sets
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        // Compute differences
        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);

        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);

        // Return results
        return Arrays.asList(diff1, diff2);
    }
}
