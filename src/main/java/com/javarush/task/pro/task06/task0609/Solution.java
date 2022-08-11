package com.javarush.task.pro.task06.task0609;

/*
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long x) {
        return x * x * x;
    }

    public static long ninthDegree(long x) {
        return cube(cube(x));
    }
}