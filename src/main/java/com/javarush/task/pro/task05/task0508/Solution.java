package com.javarush.task.pro.task05.task0508;

/*
Удаляем одинаковые строки
*/

import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        strings = new String[6];
        for (int i = 0; i < strings.length; i++)
            strings[i] = new Scanner(System.in).nextLine();

        for(int i=0; i<strings.length; i++) {
            String str = strings[i];
            for (int j=i; j<strings.length; j++) {
                if(str!= null && strings[j] != null && i!=j && str.equals(strings[j]) ) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}