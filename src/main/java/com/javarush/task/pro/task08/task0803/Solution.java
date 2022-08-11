package com.javarush.task.pro.task08.task0803;

/*
Минимальный элемент массива
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ints.length;i++){
            min = Math.min(min, ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        int[] array = new int[10];
        try(Scanner in = new Scanner(System.in)){
            for (int i = 0; i < array.length; i++)
                array[i] = in.nextInt();
        }
        return array;
    }
}