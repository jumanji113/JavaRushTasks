package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/*
Тепло или холодно
Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".


Requirements:
1. Программа должна считывать значение температуры c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если температура меньше 0, вывести только сообщение "на улице холодно".
4. Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner console = new Scanner(System.in);
        int weather = console.nextInt();
        if(weather < 0) {
            System.out.println(cold);
        } else if (weather >=0) {
            System.out.println(warm);
        }
    }
}
