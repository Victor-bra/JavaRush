package com.javarush.task.task13.task1326;

/*
Сортировка четных чисел из файла
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(new FileInputStream(new Scanner(System.in).next()));
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()){
            int number = scanner.nextInt();
            if(number%2==0)
                list.add(number);
        }
        Collections.sort(list);

        list.forEach(System.out::println);

        scanner.close();
    }
}