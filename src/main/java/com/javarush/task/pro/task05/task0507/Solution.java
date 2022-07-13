package com.javarush.task.pro.task05.task0507;

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
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                if(array[i] > max)
                    max = array[i];
            }
            System.out.println(max);
        }
    }
}