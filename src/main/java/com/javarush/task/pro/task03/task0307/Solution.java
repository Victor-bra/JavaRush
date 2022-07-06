package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш
        try(Scanner in = new Scanner(System.in)){
            int age = in.nextInt();
            if(age<20 || age >60)
                System.out.println("можно не работать");
        }
    }
}