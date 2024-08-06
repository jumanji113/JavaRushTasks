package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}