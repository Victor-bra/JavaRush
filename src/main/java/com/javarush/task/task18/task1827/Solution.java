package com.javarush.task.task18.task1827;

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

        switch (args[0]) {
            case "-c":
                int id = Integer.MIN_VALUE;
                for (Product product : products) {
                    if (product.getId() > id)
                        id = product.getId();
                }
                String productName = args[1];
                if (productName.length() > 30)
                    productName = args[1].substring(0, 30);
                String price = args[2];
                if (price.length() > 8)
                    price = price.substring(0, 8);
                String quantity = args[3];
                if (quantity.length() > 4)
                    quantity = quantity.substring(0, 4);

                Product product = new Product(++id, productName, price, quantity);
                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write("\n");
                    fileWriter.write(product.toString());
                }
                break;
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