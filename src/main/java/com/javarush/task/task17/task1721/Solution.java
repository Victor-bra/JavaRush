package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstFileName;
        String secondFileName;
        try{
            firstFileName = in.nextLine();
            secondFileName = in.nextLine();
            BufferedReader reader1 = new BufferedReader(new FileReader(firstFileName));
            String input;
            while ((input = reader1.readLine())!= null)
                allLines.add(input);
            reader1. close();
            BufferedReader reader2 = new BufferedReader(new FileReader(secondFileName));
            while ((input = reader2.readLine())!= null)
                forRemoveLines.add(input);
            reader2. close();
            new Solution().joinData();
        } catch (Exception e) {

        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}