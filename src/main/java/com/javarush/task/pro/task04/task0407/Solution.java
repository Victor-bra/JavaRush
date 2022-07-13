package com.javarush.task.pro.task04.task0407;

public class Solution {
    public static void main(String[] args) {
        int summ = 0, i = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            } else {
                summ += i;
                i++;
            }
        }
        System.out.println(summ);
    }
}