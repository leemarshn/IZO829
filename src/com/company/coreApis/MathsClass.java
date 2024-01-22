package com.company.coreApis;

import java.util.Random;

public class MathsClass {
    public static void main(String[] args) {
        for (int i=1; i <= 100; i++){
            double rad = Math.random();
           // System.out.println(rad);
        }

        int min = 5000000;
        int max = 10000000;

        Random rand = new Random();

        for (int i = 1; i <15; i++) {
            int random = rand.nextInt(max - min + 1) + max;
            System.out.println(random);
        }

    }
}
