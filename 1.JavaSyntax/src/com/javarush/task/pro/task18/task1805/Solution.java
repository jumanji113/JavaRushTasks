package com.javarush.task.pro.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength((ArrayList<String>) strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}
