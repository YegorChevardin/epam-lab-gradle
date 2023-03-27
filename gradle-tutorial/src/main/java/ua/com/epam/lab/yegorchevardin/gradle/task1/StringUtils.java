package ua.com.epam.lab.yegorchevardin.gradle.task1;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

	public boolean isPositiveNumber(String str) {
		return NumberUtils.isCreatable(str) && NumberUtils.createNumber(str).doubleValue() > 0;
	}

	public static void main(String[] args) {
        System.out.println(new StringUtils().isPositiveNumber("Hello World!"));
	}
}
