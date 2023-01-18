package com.javarush.task.task29.task2913;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Замена рекурсии
*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        //System.out.println(a + " " + b);
        ArrayList<Integer> numbers = new ArrayList<>();
        int first = a < b ? a : b, second = a < b ? b : a;
        for (int i = first; i <= second; i++)
            numbers.add(i);
        StringBuffer stringBuffer = new StringBuffer();
        if (a > b)
            Collections.reverse(numbers);
        numbers.stream().forEach(x -> stringBuffer.append(x + " "));
        return stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}