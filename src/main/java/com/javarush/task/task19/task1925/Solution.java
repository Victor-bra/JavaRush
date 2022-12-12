package com.javarush.task.task19.task1925;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if(args.length<= 1)
            throw new RuntimeException();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
            String fileContents = "";

            while (reader.ready()){
                fileContents += reader.readLine() + " ";
            }
            //fileContents = fileContents.replaceAll("\\n", " ");
            String[] argsFileContents = fileContents.split(" ");
            StringBuilder newFileContents = new StringBuilder();
            for(int i = 0; i<argsFileContents.length;i++){
                if(argsFileContents[i].length()>6)
                    newFileContents.append(argsFileContents[i] + ",");
            }
            newFileContents.deleteCharAt(newFileContents.length()-1);
            writer.write(newFileContents.toString());
        }
    }
}