package com.mystore.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.Myaccountdetailspage;
import com.mystore.pageobject.Myaccountpage;
import com.mystore.pageobject.Registeruseraccount;




public class TC_myaccountpage extends BaseClass
{
	//WebDriver driver;
	
	@Test
	public void Verifyloginandregistration() 
	{
	    //launch url
		
		driver.get(url);
		
		logger.info("launch url");
		
		Indexpage index=new Indexpage();
		index.clickonsignin();
		
		Myaccountpage myaccount=new Myaccountpage();
		myaccount.enteremailid("dipakr8999@gmail.com");
		myaccount.clickoncreatebutton();
		
		
//		Indexpage page=new Indexpage();
//	    page.clickonsignin();
//	    
//        Myaccountpage acc=new Myaccountpage();
//	    acc.enteremailid("dipaklat123456@gmail.com");
//		acc.clickoncreatebutton();
//		String actualurl=driver.getCurrentUrl();
//		Assert.assertEquals(actualurl,"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
//		
		
		
		Myaccountdetailspage accCreationPg = new Myaccountdetailspage();

		accCreationPg.selectTitleMrs();
		accCreationPg.enterCustomerFirstName("dipak");
		accCreationPg.enterCustomerLastName("rathod");
		accCreationPg.enterPassword("dipak123");
		accCreationPg.enterAddressFirstName("dipak");
		accCreationPg.enterAddressLastName("rathod");
		accCreationPg.enterAddress("18/8 worli road");

		accCreationPg.enterCity("Mumbai");
		accCreationPg.selectState("Alabama");

		accCreationPg.enterPostcode("00000");
		accCreationPg.selectCountry("United States");
		accCreationPg.enterMobilePhone("8623076420");
		accCreationPg.enterAlias("Home");

		logger.info("entered user details on account creation page.");

		accCreationPg.clickOnRegister();
		logger.info("clicked on Register button");

		Registeruseraccount regUser = new Registeruseraccount();
		String userName = regUser.getUserName1();

		Assert.assertEquals("Dipak Rathod", userName);

		logger.info("***************TestCase Verify Registration and Login ends*****************"); 

		
		
		
		
		
	}
	

}
