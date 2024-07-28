package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        int number = console.nextInt();
        if(number <= 0 || number >= 5){
            System.out.println(a);
        } else if(number >0 && number < 5){
            do
            {
                System.out.println(a);
                number--;
            }
            while (number > 0);
        }


    }
}