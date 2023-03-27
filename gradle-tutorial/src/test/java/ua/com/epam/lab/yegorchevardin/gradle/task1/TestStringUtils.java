package ua.com.epam.lab.yegorchevardin.gradle.task1;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestStringUtils {
	@Test
	public void verifyNoExceptionThrown() {
		assertFalse(new StringUtils().isPositiveNumber("Hello World!"));
	}
}
