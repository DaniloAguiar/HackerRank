package com.hackerrank.statistics.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterQuartile {

    public static void main(String[] args) {
//        interQuartile(Arrays.asList(6, 12, 8, 10, 20, 16), Arrays.asList(5, 4, 3, 2, 1, 5));
        interQuartile(Arrays.asList(6, 12, 8, 10, 20, 16), Arrays.asList(5, 4, 3, 2, 1, 5));
    }

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
        List<Integer> fullValues = new ArrayList<>();

        for (int i = 0; i < freqs.size(); i++) {
            Integer value = values.get(i);
            for (int integer = 0; integer < freqs.get(i); integer++) {
                fullValues.add(value);
            }
        }

        fullValues = quartiles(fullValues);
        System.out.println((double) fullValues.get(2) - fullValues.get(0));
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
