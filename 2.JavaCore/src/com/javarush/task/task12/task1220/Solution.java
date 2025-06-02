package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static interface CanRun{
        void run();
    }

    public static interface CanSwim{
        void swim();
    }

    public abstract class Human implements CanRun,CanSwim{
        CanSwim canSwim;
        CanRun canRun;
    }
    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
