package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/*
Нити и байты
*/

public class Solution {
    public static volatile Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        List<String> fileNames = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            if (!str.equals("exit"))
                fileNames.add(str);
            else
                break;
        }

        for (String fileName : fileNames) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.run();
        }
    }

    public static class ReadThread extends Thread {
        private FileInputStream inputStream;
        private String filename;

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.filename = fileName;
            inputStream = new FileInputStream(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            Map<Integer, Integer> chars = new HashMap<>();
            while (true) {
                try {
                    if (!(inputStream.available() > 0)) break;
                    int x = inputStream.read();
                    if (!chars.containsKey(x))
                        chars.put(x, 1);
                    else
                        chars.put(x, chars.get(x) + 1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            int maxValue = Integer.MIN_VALUE;
            int maxKey = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> character : chars.entrySet()) {
                if (character.getValue() == maxValue) {
                    if (character.getKey() < maxKey)
                        maxKey = character.getKey();
                } else if (character.getValue() > maxValue) {
                    maxKey = character.getKey();
                    maxValue = character.getValue();
                }
            }
            resultMap.put(filename, maxKey);
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}