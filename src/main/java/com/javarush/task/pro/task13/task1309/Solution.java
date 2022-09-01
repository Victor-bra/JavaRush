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
        grades.put("Макс", 2d);
        grades.put("Егор", 3d);
        grades.put("Витя", 4d);
        grades.put("Дима", 5d);
        grades.put("Влад", 6d);
    }
}