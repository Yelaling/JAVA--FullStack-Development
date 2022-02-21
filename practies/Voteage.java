package com.simplilearn.practies;

import java.util.Scanner;

public class Voteage {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age: ");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println(age +"valid for vote");
		}
		else 
		{
			System.out.println(age +"not valid for vote");
		}
		

	}

}
