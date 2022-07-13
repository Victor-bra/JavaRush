package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int i=0;
        try {
            while (true) {
                int x = in.nextInt();
                if (x > max && x%2==0)
                    max=x;
            }
        } catch (Exception e){
            System.out.println(max);
        }
    }
}