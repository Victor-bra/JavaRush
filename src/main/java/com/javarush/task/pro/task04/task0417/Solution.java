package com.javarush.task.pro.task04.task0417;

/*
Скорость ветра
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speedM = in.nextInt();
        int speedKM = (int)Math.round(speedM * 3.6);
        System.out.println(speedKM);
    }
}