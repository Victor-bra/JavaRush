package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        List<String> strs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (bufferedReader.ready())
                strs.addAll(Arrays.asList(bufferedReader.readLine().split(" ")));
        }
        for (int i = 0; i < strs.size(); i++) {
            for (int j = 0; j < strs.size(); ) {
                if (i != j && strs.get(j).equals(new StringBuilder(strs.get(i)).reverse().toString())) {
                    Pair pair = new Pair();
                    pair.first = strs.get(i);
                    pair.second = strs.get(j);
                    result.add(pair);
                    strs.remove(j);
                    strs.remove(i);
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        //result.stream().forEach(c-> System.out.println(c.toString()));
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}