package com.javarush.task.pro.task03.task0302;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        String militaryCommissar = ", явитесь в военкомат";
        try (Scanner in = new Scanner(System.in)) {
            String name = in.nextLine();
            int age = in.nextInt();
            if (age >= 18 && age <= 28)
                System.out.println(name + militaryCommissar);
        }
    }
}