package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        while(console.hasNextInt()){
            int a = console.nextInt();
            if(a <= minNumber) {
                minNumber = a;
            }

        }
        if(minNumber == Integer.MAX_VALUE){
            System.out.println(Integer.MAX_VALUE);
        } else{
            System.out.println(minNumber);
        }

    }
}