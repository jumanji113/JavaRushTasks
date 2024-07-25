package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        if(a.equals(b)){
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }

        //напишите тут ваш код

    }
}
