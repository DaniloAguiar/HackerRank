package com.hackerrank.day1;

import com.hackerrank.day2.Lonelyinteger;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void main(String[] args) {
        new MiniMaxSum();
    }


    public MiniMaxSum() {
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Integer::compareTo);

        List<BigInteger> arrBigInteger = arr.stream().map(integer -> new BigInteger(integer.toString())).collect(Collectors.toList());

        BigInteger sum = arrBigInteger.stream().reduce(new BigInteger("0"), BigInteger::add, BigInteger::add);
        BigInteger min = arrBigInteger.get(0);
        BigInteger max = arrBigInteger.get(arr.size() - 1);

        System.out.println((sum.subtract(max)) + " " + (sum.subtract(min)));
    }
}
