package com.hackerrank.day2;

import java.util.*;

public class Lonelyinteger {

    public static void main(String[] args) {
        new Lonelyinteger();
    }

    public Lonelyinteger() {
        lonelyinteger(Arrays.asList(0, 0, 1, 2, 1));
    }

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : a) {
            map.put(integer, map.containsKey(integer) ? (map.get(integer) + 1) : 1);
        }
        return map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElseGet(null);
    }
}
