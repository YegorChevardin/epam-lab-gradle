package ua.com.epam.lab.yegorchevardin.gradle.api;

import ua.com.epam.lab.yegorchevardin.gradle.core.Utils;

public class App {
    public static void main(String[] args) {
        boolean result = new Utils().isAllPositiveNumbers("12", "79");
        System.out.println(result);
    }
}