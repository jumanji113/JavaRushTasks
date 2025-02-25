package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13)); // Ожидаемый вывод: /usr/java/jdk-13/bin/
    }

    public static String changePath(String path, String jdk) {
        // Используем регулярное выражение для замены версии jdk
        String regex = "jdk[^/]+/";

        // Заменяем найденный текст на новую версию
        String updatedPath = path.replaceAll(regex, jdk + "/");

        return updatedPath;
    }
}