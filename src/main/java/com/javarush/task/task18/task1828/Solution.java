package com.javarush.task.task18.task1828;

/*
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static class Product {
        private int id;
        private String productName;
        private String price;
        private String quantity;

        public Product(int id, String productName, String price, String quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public String getProductName() {
            return productName;
        }

        public String getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", this.id, this.productName, this.price, this.quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        if (args.length == 0)
            return;

        String fileName;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName = new Scanner(System.in).nextLine()))) {
            while (fileReader.ready()) {
                Product product = getProductFromFile(fileReader.readLine());
                products.add(product);
            }
        }
        int id = Integer.parseInt(args[1]);
        switch (args[0]) {
            case "-u":
                for (Product product : products) {
                    if (product.getId() == id) {
                        product.setProductName(args[2].length() > 30 ? args[2].substring(0, 30) : args[2]);
                        product.setPrice(args[3].length() > 8 ? args[3].substring(0, 8) : args[3]);
                        product.setQuantity(args[4].length() > 4 ? args[4].substring(0, 4) : args[4]);
                    }
                }
                break;
            case "-d":
                int index = Integer.MIN_VALUE;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getId() == id)
                        index = i;
                }
                products.remove(index);
                break;
        }
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }

    }

    public static Product getProductFromFile(String str) {
        int id = Integer.parseInt(str.substring(0, 8).trim());
        String productName = str.substring(8, 38).trim();
        String price = str.substring(38, 46).trim();
        String quantity = str.substring(46, 50).trim();
        return new Product(id, productName, price, quantity);
    }
}