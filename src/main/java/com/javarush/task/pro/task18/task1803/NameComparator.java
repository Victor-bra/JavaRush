package com.javarush.task.pro.task18.task1803;

/*
Наставники JavaRush
*/

import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        if (o1.getName().length() < o2.getName().length())
            return -1;
        else if (o1.getName().length() > o2.getName().length())
            return 1;
        else
            return 0;
    }
}