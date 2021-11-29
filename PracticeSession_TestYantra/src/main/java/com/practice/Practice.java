package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	public void prac() {
		

	WebDriver driver = new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	wait.until(ExpectedConditions.elementToBeClickable(element));

}
}