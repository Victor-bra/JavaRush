package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(getQuery(params));
    }

    public static String getQuery(Map<String, String> params) {
        if (params == null)
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> param : params.entrySet()) {
            String str = "";
            if (param.getValue() != null) {
                str = param.getKey() + " = '" + param.getValue() + "' and ";
                stringBuilder.append(str);
            } else {
                str = "";
            }
        }
        if (stringBuilder.length() > 6)
            stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length());

        return stringBuilder.toString();
    }
}