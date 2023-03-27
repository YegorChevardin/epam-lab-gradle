package ua.com.epam.lab.yegorchevardin.gradle.core;

import ua.com.epam.lab.yegorchevardin.gradle.task1.StringUtils;

public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!new StringUtils().isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Utils().isAllPositiveNumbers("Hello", "World"));
    }
}