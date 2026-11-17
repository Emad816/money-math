package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        float balanceF = 0;
        double balanceD = 0;
        BigDecimal balanceB = BigDecimal.ZERO;

        for (int i = 1; i <= 10; i++) {
            balanceF += 0.10;
            System.out.printf("%.10f\n", balanceF);
            balanceD += 0.10;
            System.out.printf("%.10f\n", balanceD);
            balanceB = balanceB.add(BigDecimal.valueOf(0.10));
            System.out.println(balanceB);
        }
        System.out.println(balanceF + " | " + balanceD + " | " + balanceB);

        balanceF = 0;
        balanceD = 0;
        balanceB = BigDecimal.ZERO;









    }
}
