package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.Arrays;

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int b, int c, int d, int e){
        int [] ints = {a,b,c,d,e};
        return Arrays.stream(ints).min().getAsInt();
    }
    public static int min(int a, int b, int c, int d){
        int [] ints = {a,b,c,d};
        return Arrays.stream(ints).min().getAsInt();
    }

    public static int min(int a, int b, int c){
        int [] ints = {a,b,c};
        return Arrays.stream(ints).min().getAsInt();
    }

    public static int min(int a, int b){
        int [] ints = {a,b};
        return Arrays.stream(ints).min().getAsInt();
    }

    public static int max(int a, int b, int c, int d, int e){
        int [] ints = {a,b,c,d,e};
        return Arrays.stream(ints).max().getAsInt();
    }
    public static int max(int a, int b, int c, int d){
        int [] ints = {a,b,c,d};
        return Arrays.stream(ints).max().getAsInt();
    }

    public static int max(int a, int b, int c){
        int [] ints = {a,b,c};
        return Arrays.stream(ints).max().getAsInt();
    }

    public static int max(int a, int b){
        int [] ints = {a,b};
        return Arrays.stream(ints).max().getAsInt();
    }
}
