package com.hackerrank.statistics.day1;

import java.util.Arrays;
import java.util.List;

public class Quartiles {


    public static void main(String[] args) {
        System.out.println("Quartiles 1: " + quartiles(Arrays.asList(9, 5, 7, 1, 3))); //2, 5, 8
        System.out.println("Quartiles 2: " + quartiles(Arrays.asList(1, 3, 5, 7))); // 2, 4, 6
        System.out.println("Quartiles: " + quartiles(Arrays.asList(3, 7, 8, 5, 12, 14, 21, 13, 18)));//6, 12, 16;
    }


    public static List<Integer> quartiles(List<Integer> arr) {
        arr.sort(Integer::compareTo);

        int q1 = median(arr.subList(0, arr.size() / 2));
        int q2 = median(arr);
        int q3 = median(arr.subList(arr.size() / 2 + arr.size() % 2, arr.size()));

        return Arrays.asList(q1, q2, q3);
    }

    private static int median(List<Integer> arr) {
        int middleElements = arr.size() / 2;
        int mod = arr.size() % 2;

        return mod == 1 ? arr.get(middleElements) : ((arr.get(middleElements) + arr.get(middleElements - 1)) / 2);
    }
}
