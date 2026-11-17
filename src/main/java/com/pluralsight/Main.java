package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        float balanceF = 0;
        double balanceD = 0;
        BigDecimal balanceB = BigDecimal.ZERO;

        for (int i = 1; i <= 10; i++) {
            balanceF += 0.10;
            balanceD += 0.10;
            balanceB = balanceB.add(BigDecimal.valueOf(0.10));
        }
        System.out.printf("%.12f | %.12f | %.12f\n", balanceF, balanceD, balanceB);

        balanceF = 0;
        balanceD = 0;
        balanceB = BigDecimal.ZERO;

        for (int i = 1; i <= 1000; i++) {
            balanceF += 19.99;
            balanceD += 19.99;
            balanceB = balanceB.add(BigDecimal.valueOf(19.99));
        }
        System.out.printf("%.12f | %.12f | %.12f", balanceF, balanceD, balanceB);







    }
}
