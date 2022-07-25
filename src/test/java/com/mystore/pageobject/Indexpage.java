package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.testcases.BaseClass;

public class Indexpage
{
	private WebDriver driver;
	
	
	
	public Indexpage() 
	{
		this.driver=BaseClass.driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//a[@title='Log in to your customer account']")   
	WebElement signin;
	
	
	public void clickonsignin() 
	{
		signin.click();
	}
}
