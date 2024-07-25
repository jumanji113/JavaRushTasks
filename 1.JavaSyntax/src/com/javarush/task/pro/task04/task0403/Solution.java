package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        Scanner console = new Scanner(System.in);
        while (true) {
            if (console.hasNextInt()) {
                int num = console.nextInt();
                sum += num;
            } else {
                String str = console.nextLine();
                if (str.equals("ENTER")) {
                    System.out.println(sum);
                    break;
                }
            }
        }


    }
}