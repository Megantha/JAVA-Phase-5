package com.ecom.webapp;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Testing {
	WebDriver wd;
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() throws InterruptedException {
		
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		wd.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
	      wd.findElement(By.id("createAccountSubmit")).click();
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Mehantha");
	      Thread.sleep(5000);
	     // wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_email")).sendKeys("meha@gmail.com");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_password")).sendKeys("987654321");
	      Thread.sleep(5000);
	     // wd.findElement(By.id("ap_password_check")).sendKeys("12345678");
	     // Thread.sleep(5000);
	     wd.findElement(By.id("continue")).click();
	}
	
	      @Test(priority = 2)
	  public void login() throws InterruptedException {
		
		

		 wd.findElement(By.id("nav-link-accountList")).click();
		 Thread.sleep(5000);
	     wd.findElement(By.id("ap_email")).sendKeys("meha@gmail.com");
	     Thread.sleep(5000);
		  wd.findElement(By.id("continue")).click();
		  Thread.sleep(5000);
	     wd.findElement(By.id("ap_password")).sendKeys("987654321");
	       


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  
	      	
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("AirPods");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		    Thread.sleep(5000);
		    wd.get("https://www.amazon.in/Apple-AirPods-with-Charging-Case/dp/B07Q6153FQ/ref=sr_1_1_sspa?crid=16KOOJELCNLDY&keywords=airpods&qid=1664806415&qu=eyJxc2MiOiI2LjUwIiwicXNhIjoiNi4zMSIsInFzcCI6IjYuMzYifQ%3D%3D&sprefix=air%2Caps%2C364&sr=8-1-spons&psc=1");
		    Thread.sleep(5000);
		    wd.findElement(By.id("add-to-cart-button")).click();
		    Thread.sleep(5000);
		   
	  }
	 
	  @BeforeMethod
	    public void startbrowser()
	    {
		  WebDriverManager.chromedriver().setup();
		  	 wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
	      	 wd.manage().window().maximize();
	      	   
	    }



	      @AfterMethod
	    public void closeBrowser()
	    {
	        wd.close();
	    }
	  

}