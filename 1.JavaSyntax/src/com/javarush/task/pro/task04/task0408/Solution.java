package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(console.hasNextInt()){
            int a = console.nextInt();
            if(a > max && a % 2 == 0){
                max = a;
            }
        }
        if(max == Integer.MIN_VALUE){
            System.out.println(Integer.MIN_VALUE);
        } else {
            System.out.println(max);
        }
    }
}