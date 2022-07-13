package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println(in.nextInt()*1.0/in.nextInt());
        }

    }
}
