package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int midIndex = array.length / 2;
        int firstHalfLength = midIndex;
        int secondHalfLength = array.length - midIndex;

        Arrays.fill(array, 0, firstHalfLength, valueStart);
        Arrays.fill(array, firstHalfLength, array.length, valueEnd);

        if (array.length % 2 != 0) {
            array[midIndex] = valueStart;
        }

        System.out.println(Arrays.toString(array));

    }
}
