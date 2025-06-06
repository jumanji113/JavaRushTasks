package com.javarush.task.pro.task13.task1320;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));  // Апрель
        System.out.println(getMonthByIndex(8));  // Август
        System.out.println(getMonthByIndex(12)); // Декабрь
        System.out.println(getMonthByIndex(13)); // Недействительный месяц
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch (monthIndex) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь"; // Исправлена опечатка
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:
                monthString = "Недействительный месяц";
                break;
        }
        return monthString;
    }
}