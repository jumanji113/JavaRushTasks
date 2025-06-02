package com.javarush.task.pro.task18.task1808;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Знакомство со ссылками на методы
*/

public class Solution {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print((ArrayList<String>) strings);
    }

    public static void print(ArrayList<String> strings) {

        strings.forEach(System.out::println);
    }
}
