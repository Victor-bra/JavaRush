package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String str = in.nextLine();
            if(str.equalsIgnoreCase("enough"))
                break;
            else
                System.out.println(str);
        }
    }
}