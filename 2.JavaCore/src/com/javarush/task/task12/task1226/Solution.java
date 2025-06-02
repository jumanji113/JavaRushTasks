package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb{
        @Override
        public void run() {
            System.out.println("run");
        }

        @Override
        public void climb() {
            System.out.println("climb");
        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {
            System.out.println("run");
        }
    }

    public class Tiger extends Cat {
        @Override
        public void run(){
            System.out.println("runing");
        }
    }

    public class Duck implements CanFly, CanRun{
        @Override
        public void fly() {
            System.out.println("fly");
        }

        @Override
        public void run() {
            System.out.println("run");
        }
    }

    public interface CanFly{
        void fly();
    }

    public interface CanClimb{
        void climb();
    }

    public interface CanRun{
        void run();
    }
}
