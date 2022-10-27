package com.javarush.task.task15.task1515;

/*
Статики-2
*/

import java.util.Scanner;

public class Solution {
    public static int A;
    public static int B;

    static {
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        in.close();
    }

    public static final int MIN = min(A, B);


    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}