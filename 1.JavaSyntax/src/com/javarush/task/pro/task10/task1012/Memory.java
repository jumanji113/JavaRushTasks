package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int nonNullIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (i != nonNullIndex) {
                    array[nonNullIndex] = array[i];
                    array[i] = null;
                }
                nonNullIndex++;
            }
        }
    }
}