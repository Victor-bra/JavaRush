package com.javarush.task.pro.task15.task1516;

/*
Файл или директория
*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            if (str == null)
                break;
            Path path = Path.of(str);
            if (Files.isRegularFile(path))
                System.out.println(str + THIS_IS_FILE);
            else if (Files.isDirectory(path))
                System.out.println(str + THIS_IS_DIR);
            else
                break;
        }
    }
}