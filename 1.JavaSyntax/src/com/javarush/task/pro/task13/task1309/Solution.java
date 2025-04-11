package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Levan", 3.3);
        grades.put("Ignat", 3.3);
        grades.put("Okko", 3.3);
        grades.put("Ivi", 3.3);
        grades.put("KINO", 3.3);

//        for(String key : grades.keySet()){
//            Double value = grades.get(key);
//            System.out.println(key + "--->" + value);
//        }
    }
}
