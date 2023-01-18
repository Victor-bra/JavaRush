package com.javarush.task.task30.task3002;

/*
Осваиваем методы класса Integer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); //22
        System.out.println(convertToDecimalSystem("012"));  //10
        System.out.println(convertToDecimalSystem("0b10")); //2
        System.out.println(convertToDecimalSystem("62"));   //62
    }

    public static String convertToDecimalSystem(String s) {
        //напишите тут ваш код
        char[] str = s.toCharArray();
        if(str[0] == '0'){
            if(str[1]=='x')
                return Integer.parseInt(s.substring(2),16)+"";
            else if(str[1]=='b')
                return Integer.parseInt(s.substring(2),2)+"";
            else
                return Integer.parseInt(s,8)+"";
        }
        return s;
    }
}