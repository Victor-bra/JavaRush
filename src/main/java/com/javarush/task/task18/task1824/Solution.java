package com.javarush.task.task18.task1824;

/*
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = null;
        while (true) {
            try (FileInputStream inputStream = new FileInputStream(fileName = new Scanner(System.in).nextLine())) {
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}