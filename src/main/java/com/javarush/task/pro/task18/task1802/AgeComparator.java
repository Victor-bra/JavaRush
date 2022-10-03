package com.javarush.task.pro.task18.task1802;

/*
Сортировка по возрасту
*/

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge())
            return -1;
        else if (o1.getAge() < o2.getAge())
            return 1;
        else
            return 0;
    }
}