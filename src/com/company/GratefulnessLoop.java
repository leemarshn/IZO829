package com.company;


public class GratefulnessLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int n=1; n<=365; n++){
            System.out.println("Day: " +n);
            Thread.sleep(50);
        }

        System.out.println("CONGRATULATIONS YOU MADE IT TO THE LAST DAY OF 2023: 365/365");
    }
}
