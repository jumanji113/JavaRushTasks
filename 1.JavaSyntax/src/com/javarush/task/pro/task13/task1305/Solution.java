package com.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Найти и обезвредить
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i).toLowerCase();
            if(word.contains("bug")){
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишите тут ваш код
        Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
            String str = it.next().toLowerCase();
            if (str.contains("bug"))
                it.remove();
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> listCopy = new ArrayList(list);

        for (String str: listCopy)
        {
            if (str.toLowerCase().contains("bug"))
                list.remove(str);
        }
    }
}
