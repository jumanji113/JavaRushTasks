package com.javarush.task.pro.task02.task0214;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
    Scanner inputUser = new Scanner(System.in);
    String name = inputUser.nextLine();
    String middleName = inputUser.nextLine();
    String surname = inputUser.nextLine();
    System.out.println(surname);
    System.out.println(middleName.toUpperCase());
    System.out.println(name.toLowerCase());
    }
}
