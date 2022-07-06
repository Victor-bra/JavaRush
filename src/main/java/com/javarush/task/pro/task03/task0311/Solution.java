package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.close();

        if(Math.abs(a-b)<0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}