package com.javarush.task.pro.task13.task1318;

/*
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int number = month.ordinal();
        System.out.println(number);
        System.out.println(month.values().length-1);
        if(number==month.values().length-1){
            return Month.values()[0];
        }
        return Month.values()[number+1];
    }
}