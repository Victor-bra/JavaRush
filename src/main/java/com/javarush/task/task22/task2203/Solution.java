package com.javarush.task.task22.task2203;

/*
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            String[] str = string.split("\\t");
            if(str.length<3) throw new TooShortStringException();
            return str[1];
        } catch (Exception e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}