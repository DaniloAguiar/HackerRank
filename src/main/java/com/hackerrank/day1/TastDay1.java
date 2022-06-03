package com.hackerrank.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class TastDay1 {

    public static void main(String[] args) {
        new TastDay1();
    }

    public TastDay1() {
        System.out.println(findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3)));
        ;
    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Integer::compareTo);
        int med = arr.size() / 2;
        return (arr.get(med) + arr.get(med - 1) + arr.get(med + 1)) / 3;
    }

}
