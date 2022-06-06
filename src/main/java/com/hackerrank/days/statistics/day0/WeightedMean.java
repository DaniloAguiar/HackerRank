package com.hackerrank.days.statistics.day0;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class WeightedMean {

    public static void main(String[] args) throws java.lang.Exception {
        weightedMean(Arrays.asList(10, 40, 30, 50, 20, 10, 40, 30, 50, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 10, 40, 30, 50, 20, 10, 40, 30, 50),
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 40, 30, 50, 20, 10, 40, 30, 50, 20));
    }

    /*
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     */
    public static void weightedMean(List<Integer> X, List<Integer> W) {
        NumberFormat numberFormat = DecimalFormat.getInstance(Locale.US);
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setMaximumFractionDigits(1);

        double total = 0;
        double totalW = sumList(W);

        for (int i = 0; i < X.size(); i++) total = total + (X.get(i) * W.get(i));

        System.out.println(numberFormat.format(total / totalW));
    }

    private static double sumList(List<Integer> integers) {
        return integers.stream().map(Double::new).reduce(0D, Double::sum);
    }

}
