package com.hackerrank.code;

public class Solve {

    public static void main(String[] args) {
        solve(10.25, 17, 5);
    }

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = ((double) tip_percent / 100) * meal_cost;
        double tax = ((double) tax_percent / 100) * meal_cost;

        System.out.println(Math.round(meal_cost + tip + tax));
    }
}
