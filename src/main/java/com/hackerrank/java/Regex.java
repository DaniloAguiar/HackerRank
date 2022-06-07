package com.hackerrank.java;

import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {
        for (String s : Arrays.asList(
                "000.12.12.034",
                "121.234.12.12",
                "23.45.12.56",
                "00.12.123.123123.123",
                "122.23",
                "Hello.IP",
                "259.259.259.259",
                "266.266.266.266",
                "255.255.255.255",
                "555.555.555.555",
                "666.666.666.666",
                "249.249.249.249",
                "249.249.249.256")) {
            System.out.println(s.matches(new MyRegex().pattern));
        }
    }

    public static class MyRegex {
        public String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9]{0,2})\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]{0,2})";
    }

}
