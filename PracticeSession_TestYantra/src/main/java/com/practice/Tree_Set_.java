package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location;

public class Tree_Set_ {
	@Test
	public void tree() {
		int count = 0;
		String price = "";
		int p   = 0;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--disable-gpu");
		co.addArguments("test-type");
		co.addArguments("start-maximized");
		co.addArguments("--window-size=1920,1080");
		co.addArguments("--enable-precise-memory-info");
		co.addArguments("--disable-popup-blocking");
		co.addArguments("--disable-default-apps");
		co.addArguments("test-type=browser");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, co);
		
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
	driver.get("https://username:password@www.amazon.in");
	WebElement ele = driver.findElement(By.id("searchDropdownBox"));
	Point loc = ele.getLocation();
	
	int x = loc.getX();
	int y = loc.getY();
	System.out.println(x + " " + y);
	ele.click();
	driver.findElement(By.xpath("//select//option[text()='Electronics']")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Iphone");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List <WebElement> lst = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	TreeSet <Integer> ts = new TreeSet <Integer>();
	//Collection c = lst;
	System.out.println("Sorted Prices in Ascending order is");
	for(WebElement wb : lst) {
		 price = wb.getText();
		 
	p = Integer.parseInt(price.replace(",", ""));
		//System.out.println(wb.getText());
		ts.add(p);
		
		SoftAssert sa = new SoftAssert();
		
	 
		
		
	}
	System.out.println(ts);
	System.out.println("The size of the TreeSet is :" + ts.size());
	
		
	
		driver.close(); 
	
	
		
		
	
}}
		
		
		
	

