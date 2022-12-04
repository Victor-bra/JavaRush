package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        List<String> oldFile = new ArrayList<>();
        List<String> updateFile = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader firstFile = new BufferedReader(new FileReader(reader.readLine()/*"d:/data1.txt"*/));
             BufferedReader secondFile = new BufferedReader(new FileReader(reader.readLine()/*"d:/data2.txt"*/))) {
            while (firstFile.ready())
                oldFile.add(firstFile.readLine());
            while (secondFile.ready())
                updateFile.add(secondFile.readLine());

            /*oldFile.stream().forEach(s -> System.out.print(s + " "));
            System.out.println();
            updateFile.stream().forEach(s -> System.out.print(s + " "));
            System.out.println();*/

            int first = 0;
            int second = 0;
            while (first < oldFile.size() && second < updateFile.size()) {
                if (oldFile.get(first).equals(updateFile.get(second))) {
                    lines.add(new LineItem(Type.SAME, oldFile.get(first)));
                    first++;
                    second++;
                } else if (second + 1 < updateFile.size() && oldFile.get(first).equals(updateFile.get(second + 1))) {
                    lines.add(new LineItem(Type.ADDED, updateFile.get(second)));
                    second++;
                } else if (first + 1 < oldFile.size() && oldFile.get(first + 1).equals(updateFile.get(second))) {
                    lines.add(new LineItem(Type.REMOVED, oldFile.get(first)));
                    first++;
                }
            }
            while(first< oldFile.size()){
                lines.add(new LineItem(Type.REMOVED, oldFile.get(first)));
                first++;
            }
            while(second< updateFile.size()){
                lines.add(new LineItem(Type.ADDED, updateFile.get(second)));
                second++;
            }
        } /*finally {
            lines.stream().forEach(s -> System.out.println(s.toString()));
        }*/
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }
    }
}