package com_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {

	Properties pro;
	
   public	configDataProvider() throws IOException{
		String configpath="C:\\Users\\jalindar.chougule\\eclipse-workspace\\Dummy_Data_Framework\\configData\\datafile";
		File src=new File(configpath);
		FileInputStream file=new FileInputStream(src); 
		 pro=new Properties();
		
		pro.load(file);
	}
   
   public String URL() {
	   return pro.getProperty("url");
	   
   }
   public String firstname() {
	   return pro.getProperty("FirstName");
   }
   
   public String lastname() {
	   return pro.getProperty("LastName");
   }
   


}
