package com.hackerrank.week.preparation.day2;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        new DiagonalDifference();
    }

    public DiagonalDifference() {
        System.out.println(diagonalDifference(Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        )));

        System.out.println(diagonalDifference(Arrays.asList(
                Arrays.asList(6, 6, 7, -10, 9, -3, 8, 9, -1),
                Arrays.asList(9, 7, -10, 6, 4, 1, 6, 1, 1),
                Arrays.asList(-1, -2, 4, -6, 1, -4, -6, 3, 9),
                Arrays.asList(-8, 7, 6, -1, -6, -6, 6, -7, 2),
                Arrays.asList(-10, -4, 9, 1, -7, 8, -5, 3, -5),
                Arrays.asList(-8, -3, -4, 2, -3, 7, -5, 1, -5),
                Arrays.asList(-2, -7, -4, 8, 3, -1, 8, 2, 3),
                Arrays.asList(-3, 4, 6, -7, -7, -8, -3, 9, -6),
                Arrays.asList(-2, 0, 5, 4, 4, 4, -3, 3, 0)
        )));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int minArr = 0;
        int maxArr = arr.size() - 1;

        int tot1 = 0;
        int tot2 = 0;

        while (minArr < arr.size()) {
            tot1 = tot1 + arr.get(minArr).get(minArr);
            tot2 = tot2 + arr.get(minArr).get(maxArr);

            minArr++;
            maxArr--;
        }

        return Math.max(tot2, tot1) - Math.min(tot1, tot2);
    }
}
