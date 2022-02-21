package com.simplilearn.inner;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) 
	{
		
		String s1 = new String("Hello World");
		
		System.out.println("length :"+ s1.length());
		System.out.println("charter at index 2:"+s1.charAt(2));
		System.out.println(s1.startsWith("Hello"));
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter your password");
		//String pwd = sc.nextLine();
		//if(s.equals(pwd)
		//System.out.println(""Authenticated);
		//else
			//System.out.println("invalid user");
		//sc.close();
		

	}

}

//String s = new String("Hello World");
//
//System.out.println("Length: "+s.length());
//System.out.println("Character at Index 3: "+s.charAt(3));
//System.out.println(s.startsWith("Hello"));
////Scanner sc=new Scanner(System.in);
////System.out.println("Enter your password");
////String pwd=sc.nextLine();
////if(s.equalsIgnoreCase(pwd))
////    System.out.println("Authenticated");
////else
////    System.out.println("Incorrect Password");
////sc.close();
//
//String str="       Hello          ";
//System.out.println(str.length());
//System.out.println(str.stripLeading().length());
//System.out.println(str.stripTrailing().length());
//System.out.println(str.trim().length());
//}
//}
