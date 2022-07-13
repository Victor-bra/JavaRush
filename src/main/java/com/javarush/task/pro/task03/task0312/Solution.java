package com.javarush.task.pro.task03.task0312;

/*
Сравним строки
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if(str1.equals(str2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}