package com.hackerrank.week.preparation.day1;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PlusMinus {

    public static void main(String[] args) {
        new PlusMinus();
    }

    public PlusMinus() {
        plusMinus(Arrays.asList(1, 2, 3, -1, -2, -3, 0, 0));
    }

    public static void plusMinus(List<Integer> arr) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMinimumFractionDigits(6);

        double size = arr.size();
        double sizePos = arr.stream().filter(integer -> integer > 0).count();
        double sizePosNeg = arr.stream().filter(integer -> integer < 0).count();
        double sizePosZero = arr.stream().filter(integer -> integer == 0).count();

        System.out.println(numberFormat.format(sizePos / size));
        System.out.println(numberFormat.format(sizePosNeg / size));
        System.out.println(numberFormat.format(sizePosZero / size));
    }
}
