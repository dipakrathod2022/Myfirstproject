package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.testcases.BaseClass;

public class Myaccountpage
{
	
		private WebDriver driver;
		
		public Myaccountpage() 
		{
			this.driver=BaseClass.driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="(//input[@type='text'])[2]") 
		private WebElement emailid;
		@FindBy(xpath="//button[@id='SubmitCreate']") 
		private WebElement createbutton;
		
		
		public void enteremailid(String emailadd) 
		{
			
			emailid.sendKeys(emailadd);
		}
		
		public void clickoncreatebutton() 
		{
			createbutton.click();
		}
		

	}


