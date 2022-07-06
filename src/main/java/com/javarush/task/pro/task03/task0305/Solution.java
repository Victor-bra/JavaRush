package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a==b && b==c)
                System.out.println(a + " " + b + " " + c);
            else if(a==b)
                System.out.println(a + " " + b);
            else if(a == c)
                System.out.println(a + " " + c);
            else if(b == c)
                System.out.println(b + " " + c);
        }
    }
}