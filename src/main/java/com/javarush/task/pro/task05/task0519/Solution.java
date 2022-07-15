package com.javarush.task.pro.task05.task0519;

/*
Есть ли кто?
*/

import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mass = Arrays.copyOf(array, array.length);
        Arrays.sort(mass);
        int index = Arrays.binarySearch(mass, element);
        System.out.println(index >= 0 ? true : false);
    }
}