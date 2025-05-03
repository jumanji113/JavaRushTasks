package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        Month [] months = Month.values();
        if(month.ordinal() == 11){
            return months[0];
        } else {
            int i = month.ordinal();
            return months[i + 1];
        }
    }
}
