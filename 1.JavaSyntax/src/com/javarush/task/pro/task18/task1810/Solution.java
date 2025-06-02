package com.javarush.task.pro.task18.task1810;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Преобразование списка в массив
*/

public class Solution {

    public static void main(String[] args) {
        List strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        List integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray((ArrayList<String>) strings).toArray(new String[0]);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray((ArrayList<Integer>) integers).toArray(new Integer[0]);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static ArrayList<String> toStringArray(ArrayList<String> strings) {
        return strings;
    }

    public static ArrayList<Integer> toIntegerArray(ArrayList<Integer> integers) {
        return integers;
    }
}
