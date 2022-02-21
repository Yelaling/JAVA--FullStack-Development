package com.simplilearn.mainproject;

import java.util.Scanner;

public class ArithmaticCalalutor {

	public static void main(String[] args) 
	{
		char Operator;
		Double number1, number2, Result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose an operator:Addition, substraction, multiplication, division");
		Operator= sc.next().charAt(0);
		
		System.out.println("enter first number");
		number1 = sc.nextDouble();
		
		System.out.println("enter second number");
		number2 = sc.nextDouble();
		
		switch(Operator)
		{
		case'+':Result = number1+number2;
			System.out.println(number1+ " Addition " +number2+" = " +Result);
			break;
			
		case'-':Result = number1-number2;
		System.out.println(number1+ " substraction " +number2+" = " +Result);
		break;
		
		case'*':Result = number1*number2;
		System.out.println(number1+ " multiplication " +number2+" = " +Result);
		break;
		
		case'/':Result = number1/number2;
		System.out.println(number1+ " division " +number2+" = " +Result);
		break;
		
		default:
			System.out.println("INVALID OPERATOR!");
			break;
		}
		sc.close();
		
		
		
	}

}
