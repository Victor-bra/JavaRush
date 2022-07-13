package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firsMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        try{
            while(true){
                int x = in.nextInt();
                if(x<firsMin){
                    secondMin = firsMin;
                    firsMin = x;
                }
                else if(x>firsMin && x<secondMin)
                    secondMin = x;
            }
        }catch (Exception e){
            System.out.println(secondMin);
        }
    }
}