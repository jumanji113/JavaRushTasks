package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths(){
        return new Month[]{JANUARY, FEBRUARY, DECEMBER };
    }

    public static Month[] getSpringMonths(){
        return new Month[]{MARCH, APRIL, MAY };
    }

    public static Month[] getSummerMonths(){
        return new Month[]{JUNE, JULY, AUGUST };
    }

    public static Month[] getAutumnMonths(){
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER };
    }

}
