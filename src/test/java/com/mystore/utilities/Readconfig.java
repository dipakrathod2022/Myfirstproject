package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig 
{
	
	Properties prop;
	
	String path="C:\\Users\\User\\eclipse-workspace\\Mystore\\Configuration\\config.properties";
	
	public Readconfig() 
	{
		
		try {
			
			prop=new Properties();
			
			FileInputStream file=new FileInputStream(path);
			
			prop.load(file);
		   }
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
 }
	public String Baseurl()
	{
	     String value = prop.getProperty("baseurl");
	     
	     if(value!=null)
	    	 return value;
	     
	     else
	    	 throw new RuntimeException("browser is not avilable");
	}
	
	public String basebrowser() 
	{
		String value2 = prop.getProperty("browser");
		
		if(value2!=null) {
			
			return value2;}
		else
			{throw new RuntimeException("browser is not avilable");}
		
	}
	
	}		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


