package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        try(Scanner in  = new Scanner(System.in)){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if(x<(y+z) && y<(x+z) && z<(x+y))
                System.out.println(TRIANGLE_EXISTS);
            else
                System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}