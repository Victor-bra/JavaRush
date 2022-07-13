package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

public class Solution {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        System.out.println((int)(PI*radius*radius));
        in.close();
    }
}
