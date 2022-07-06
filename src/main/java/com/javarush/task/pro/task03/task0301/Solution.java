package com.javarush.task.pro.task03.task0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temperature = Integer.parseInt(br.readLine());
        if(temperature <0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }
}