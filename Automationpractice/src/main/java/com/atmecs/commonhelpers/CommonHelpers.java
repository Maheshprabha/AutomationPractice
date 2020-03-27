package com.atmecs.commonhelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonHelpers {
	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();

	}
   public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}

}
