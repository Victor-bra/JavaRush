package com.javarush.task.pro.task04.task0418;

/*
Стакан наполовину пуст или наполовину полон?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        try(Scanner in = new Scanner(System.in)){
            boolean result = in.nextBoolean();
            if(result)
                System.out.println((int)Math.ceil(glass));
            else
                System.out.println((int)Math.floor(glass));
        }
    }
}