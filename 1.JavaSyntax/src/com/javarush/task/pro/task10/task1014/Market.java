package com.javarush.task.pro.task10.task1014;

/* 
Купи 10 батонов
*/

import java.util.Scanner;

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean arg) {
        if (arg) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }

}


