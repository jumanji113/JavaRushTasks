package com.javarush.task.pro.task05.task0509;

/*
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i < MULTIPLICATION_TABLE.length + 1; i++) {
            for (int j = 1; j < MULTIPLICATION_TABLE.length + 1; j++) {
                MULTIPLICATION_TABLE[i-1][j-1] = i * j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j]  + " ");
            }
            System.out.println();
        }

    }
}
