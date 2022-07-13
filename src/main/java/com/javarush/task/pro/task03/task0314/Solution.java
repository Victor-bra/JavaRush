package com.javarush.task.pro.task03.task0314;

/*                                                   
Сломанная клавиатура                                                  
*/

import java.util.Scanner;

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        if(secret.equalsIgnoreCase(new Scanner(System.in).nextLine()))
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}