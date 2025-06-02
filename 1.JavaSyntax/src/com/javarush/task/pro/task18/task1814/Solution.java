package com.javarush.task.pro.task18.task1814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/* 
Без повторов
*/

public class Solution {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        Collections.addAll(words, "чтобы", "стать", "программистом", "нужно", "программировать",
                "а", "чтобы", "программировать", "нужно", "учиться");

        Stream<String> distinctWords = getDistinctWords((ArrayList<String>) words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        //напишите тут ваш код

        return words.stream().distinct();
    }
}
