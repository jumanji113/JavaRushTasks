package com.javarush.task.pro.task09.task0905;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }

        int octalNumber = 0;
        int power = 0;
        while (decimalNumber > 0) {
            octalNumber += (decimalNumber % 8) * (int) Math.pow(10, power++);
            decimalNumber /= 8;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }

        int decimalNumber = 0;
        int power = 0;
        while (octalNumber > 0) {
            decimalNumber += (octalNumber % 10) * (int) Math.pow(8, power++);
            octalNumber /= 10;
        }
        return decimalNumber;
    }
}