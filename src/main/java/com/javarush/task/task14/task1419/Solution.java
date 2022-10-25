package com.javarush.task.task14.task1419;

import javax.management.relation.InvalidRelationIdException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(new UnsupportedOperationException());
            exceptions.add(new ArithmeticException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new ClassCastException());
            exceptions.add(new ConcurrentModificationException());
            exceptions.add(new EmptyStackException());
            exceptions.add(new IllegalAccessException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new InvalidRelationIdException());
        }

        //напишите тут ваш код

    }
}