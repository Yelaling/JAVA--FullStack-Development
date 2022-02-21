package com.simplilearn.Regextion;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidate
{
	
	
	public static String emailval(String email)
	{
		if(email==null || email.isEmpty())
		{
			return "invalid";
			
		}
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		
		Pattern pattern= Pattern.compile(emailRegex);
		
		if(pattern.matcher(email).matches())
		{
			return "valid";
		}
		else
		{
			return "invalid";
		}
		
	}
	public static void main(String[] args)
	{
		String email1 = "yallu123gmail.com";
		String email2 = "prabha@gmail.com";
		
		System.out.println("email1 :"+emailval(email1));
		System.out.println("email2 :"+emailval(email2));
		
		
	}

}
