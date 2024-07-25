package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int height = 5;
        int width = 10;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}