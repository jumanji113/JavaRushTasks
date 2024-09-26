package com.javarush.task.pro.task09.task0917;

/* 
String pool
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        return first.length() == second.length() && first.regionMatches(0, second, 0, first.length());
    }

}
