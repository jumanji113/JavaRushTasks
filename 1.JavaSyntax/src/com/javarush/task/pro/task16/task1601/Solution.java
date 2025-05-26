package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(1996, 5, 14);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        String day = "";
        int i = date.getDay();
        switch (i){
            case 0:
                day = "воскресенье";
                break;
            case 1:
                day = "понедельник";
                break;
            case 2:
                day = "вторник";
                break;
            case 3:
                day = "среда";
                break;
            case 4:
                day = "четверг";
                break;
            case 5:
                day = "пятница";
                break;
            case 6:
                day = "суббота";
                break;
        }
        return day;
    }
}
