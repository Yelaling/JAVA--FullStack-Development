package com.simplilearn.inner;

public class StringBufferDemo {

	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Hello World");
		
		System.out.println("charater element at index:"+str.charAt(4));
		System.out.println("String length "+str.length());
		System.out.println("Replace "+ str.replace(0,5,"Welcome"));
		System.out.println("Reverse String "+str.reverse());

	}

}
