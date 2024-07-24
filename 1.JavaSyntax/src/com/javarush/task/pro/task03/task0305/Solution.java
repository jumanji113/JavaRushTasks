package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/*
Три числа
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2

Requirements:
1. Программа должна считывать три числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести их на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if(a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b && c != b) {
            System.out.println(a + " " + b);
        } else if (c == b && a != b) {
            System.out.println(c + " " + b);
        } else if (c == a && c != b) {
            System.out.println(a + " " + c);
        }
    }
}
