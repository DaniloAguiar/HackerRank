package com.hackerrank.days.statistics.day0;

import java.util.*;

public class MeanMedianMode {


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060);
        integers.sort(Integer::compareTo);

        int qtdElement = integers.size();

        double sum = sumList(integers);
        double media = sum / qtdElement;
        double mediana = ((double) (integers.get(qtdElement / 2 - 1) + integers.get(qtdElement / 2))) / 2;
        int moda = moda(integers);

        System.out.println(media);
        System.out.println(mediana);
        System.out.println(moda);
    }

    private static Integer sumList(List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum, Integer::compareTo);
    }

    private static Integer moda(List<Integer> integers) {
        int comparaV = 0;
        int moda = 0;
        for (int p = 0; p < integers.size(); p++) {
            int nVezes = 1;

            for (int k = p + 1; k < integers.size(); k++) {
                if (Objects.equals(integers.get(p), integers.get(k))) ++nVezes;
            }
            if (nVezes > comparaV) {
                moda = integers.get(p);
                comparaV = nVezes;
            }
        }
        return moda;
    }

}
