package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);// объект сканнер
        int number = console.nextInt(); // число н получено от пользака
        if(number > 0){ //первая проверка
            int[] arr = new int[number]; // массив
            for(int i = 0; i < number; i++){
                arr[i] = console.nextInt();//заполняем массив числами введенными
            }
            if(number % 2 == 0) {// проверка на четность N
                for(int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            } else { // если нечетное
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
