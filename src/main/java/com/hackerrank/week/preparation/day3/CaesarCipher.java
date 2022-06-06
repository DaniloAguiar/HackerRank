package com.hackerrank.week.preparation.day3;

import java.util.Arrays;

public class CaesarCipher {

    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(caesarCipher("middle-Outz", 2)); //okffng-Qwvb
        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 2)); //Cnycau-Nqqm-qp-vjg-Dtkijv-Ukfg-qh-Nkhg
//        System.out.println(caesarCipher("l", 2));
    }

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
    public static String caesarCipher(String s, int k) {
        char[] charsCipher = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int charInt = s.charAt(i);
            if (Character.isAlphabetic(charInt)) {

                charsCipher[i] = Character.isUpperCase(charInt)
                        ? (char) (65 + ((charInt + k - 65) % 26))
                        : (char) (97 + ((charInt + k - 97) % 26));
            } else {
                charsCipher[i] = s.charAt(i);
            }
        }
        return String.valueOf(charsCipher);
    }

}
