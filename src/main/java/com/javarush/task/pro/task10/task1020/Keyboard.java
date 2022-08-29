package com.javarush.task.pro.task10.task1020;

import java.util.Calendar;

/*
Текущий год
*/

public class Keyboard {

    private int currentYear;

    public Keyboard() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Keyboard solution = new Keyboard();
        System.out.println(solution.getCurrentYear());
    }
}