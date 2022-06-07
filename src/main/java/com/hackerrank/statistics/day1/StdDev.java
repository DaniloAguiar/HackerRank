package com.hackerrank.statistics.day1;

import java.util.Arrays;
import java.util.List;

public class StdDev {

    public static void main(String[] args) {
        stdDev(Arrays.asList(10, 40, 30, 50, 20));
    }

    public static void stdDev(List<Integer> arr) {
        double sumList = sumList(arr);
        System.out.printf("%.1f%n", Math.sqrt((sumElementSquared(arr) - ((sumList * sumList) / arr.size())) / arr.size() - 1));
    }

    private static double sumList(List<Integer> arr) {
        return arr.stream().map(Double::new).reduce(0D, Double::sum);
    }

    private static double sumElementSquared(List<Integer> arr) {
        return arr.stream().map(Double::new).map(aDouble -> aDouble * aDouble).reduce(0D, Double::sum);
    }
}
