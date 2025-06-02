package com.javarush.task.pro.task18.task1806;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Знакомство с foreach
*/

public class Solution {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(x -> System.out.println(x));
    }
}
