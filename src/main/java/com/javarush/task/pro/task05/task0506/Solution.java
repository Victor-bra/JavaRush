package com.javarush.task.pro.task05.task0506;

/*
Минимальное из N чисел
*/

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try (Scanner in = new Scanner(System.in)) {
            array = new int[in.nextInt()];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                if(array[i] < min)
                    min = array[i];
            }
            System.out.println(min);
        }
    }
}