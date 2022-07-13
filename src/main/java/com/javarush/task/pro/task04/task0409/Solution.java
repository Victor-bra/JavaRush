package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int i=0;
        try {
            while (true) {
                int x = in.nextInt();
                if (x < min)
                    min=x;
            }
        } catch (Exception e){
            System.out.println(min);
        }
    }
}