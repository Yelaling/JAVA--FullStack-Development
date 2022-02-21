package com.simplilearn.inner;

public class StringBuilderDemo {

	public static void main(String[] args)
	{
		String str1 = "sonam soni";
StringBuilder str = new StringBuilder(str1);
		
		System.out.println("charater element at index:"+str.charAt(4));
		System.out.println("String length "+str.length());
		System.out.println("Replace "+ str.replace(0,5,"Welcome"));
		System.out.println("Reverse String "+str.reverse());

	}

}
