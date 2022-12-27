package com.javarush.task.task25.task2512;

/*
Живем своим умом
*/

import java.util.ArrayList;
import java.util.List;

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        List<String> strings = new ArrayList<>();
        while (e!=null){
            strings.add(0,e.toString());
            e = e.getCause();
        }
        for(String s: strings)
            System.out.println(s);
    }

    public static void main(String[] args) {
    }
}