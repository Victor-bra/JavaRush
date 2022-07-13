package com.javarush.task.pro.task04.task0402;

/*
Все любят Мамбу
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        String name = new Scanner(System.in).nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}