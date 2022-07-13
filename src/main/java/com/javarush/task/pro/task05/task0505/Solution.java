package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int lengthArray = in.nextInt();
            if(lengthArray>0){
                int[] array = new int[lengthArray];
                for (int i = 0; i < lengthArray; i++) {
                    array[i] = in.nextInt();
                }
                if(lengthArray%2!=0){
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                } else{
                    for (int i = array.length-1; i >=0; i--) {
                        System.out.println(array[i]);
                    }
                }
            }
        }
    }
}