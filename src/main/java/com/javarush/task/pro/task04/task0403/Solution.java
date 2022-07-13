package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int summ = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            String str = in.nextLine();
            if(str.equalsIgnoreCase("ENTER")) {
                System.out.println(summ);
                break;
            }
            else {
                summ += Integer.parseInt(str);
            }
        }
        in.close();
    }
}