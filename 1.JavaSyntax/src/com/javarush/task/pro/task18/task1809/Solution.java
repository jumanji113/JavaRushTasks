package com.javarush.task.pro.task18.task1809;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Прощание со ссылками на методы
*/

public class Solution {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print((ArrayList<Integer>) numbers);
    }

    public static void print(ArrayList<Integer> numbers) {

        numbers.forEach(x-> System.out.println(x));
    }
}
