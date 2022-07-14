package com.javarush.task.pro.task05.task0511;

/*
Создаем двумерный массив
*/

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            multiArray = new int[n][];
            for(int i=0;i< multiArray.length;i++){
                multiArray[i] = new int[in.nextInt()];
            }
        }
    }
}