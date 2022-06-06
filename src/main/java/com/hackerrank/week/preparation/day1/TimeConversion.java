package com.hackerrank.week.preparation.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {

    public static void main(String[] args) {
        new TimeConversion();
    }

    static SimpleDateFormat parse = new SimpleDateFormat("hh:mm:ssaa");
    static SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public TimeConversion() {
        timeConversion("07:05:45PM");
    }

    public static String timeConversion(String s) {
        try {
            return format.format(parse.parse(s));
        } catch (ParseException e) {
            return s;
        }
    }

}
