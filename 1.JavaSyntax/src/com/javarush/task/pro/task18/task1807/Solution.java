package com.javarush.task.pro.task18.task1807;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Прощание с foreach
*/

public class Solution {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print((ArrayList<String>) strings);
    }

    public static void print(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
