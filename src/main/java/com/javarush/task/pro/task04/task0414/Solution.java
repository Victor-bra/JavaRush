package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            String str = in.nextLine();
            int number = in.nextInt();
            if(number<=0 || number>=5) {
                System.out.println(str);
            } else{
                do{
                    number--;
                    System.out.println(str);
                }while (number>=1);
            }
        }
    }
}
