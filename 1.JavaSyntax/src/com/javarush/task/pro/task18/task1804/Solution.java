package com.javarush.task.pro.task18.task1804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
Знакомство с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers((ArrayList<Integer>) numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        numbers.sort(Comparator.comparingInt(x -> x.intValue()));
    }
}
