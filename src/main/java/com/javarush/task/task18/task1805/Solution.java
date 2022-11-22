package com.javarush.task.task18.task1805;

/*
Сортировка байт
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer,Integer> fileMaps = new TreeMap<>();
        try(FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine())){
            while(inputStream.available()>0){
                fileMaps.put(inputStream.read(), 1);
            }
        }
        for(Map.Entry<Integer, Integer> fileMap: fileMaps.entrySet()){
            System.out.print(fileMap.getKey() + " ");
        }
    }
}