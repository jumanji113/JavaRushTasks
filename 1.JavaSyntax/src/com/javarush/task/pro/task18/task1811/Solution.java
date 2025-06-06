package com.javarush.task.pro.task18.task1811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/* 
Получение потока Stream
*/

public class Solution {

    public static void main(String[] args) {
        List strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Лето", "Осень");

        Stream<String> stringStream = getStreamFromArrayList((ArrayList<String>) strings);
        stringStream.forEach(System.out::println);

        List integers = Arrays.asList(new Integer[]{12, 34, 56, 78, 90});

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        //напишите тут ваш код
        Stream<String> str = list.stream();
        return str;
    }

    public static Stream<Integer> getStreamFromArray(List array) {
        //напишите тут ваш код
        return (Stream<Integer>) array;
    }
}
