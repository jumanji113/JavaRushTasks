package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{
        @Override
        public void eat() {
            System.out.println("");
        }

        @Override
        public void move() {
            System.out.println("");
        }
    }

    public class Duck implements CanFly,CanEat, CanMove{
        @Override
        public void eat() {
            System.out.println("");
        }

        @Override
        public void fly() {
            System.out.println("");
        }

        @Override
        public void move() {
            System.out.println("");
        }
    }

    public class Car implements CanMove{

        @Override
        public void move() {
            System.out.println("");
        }
    }

    public class Airplane implements CanFly, CanMove{

        @Override
        public void fly() {
            System.out.println("");
        }

        @Override
        public void move() {
            System.out.println("");
        }
    }
}
