package com.simplilearn.typecasting;

public class TypeCasting {

	public static void main(String[] args) 
	{
		//Implicit Conversion
				System.out.println("Implicit Typecasting");
				char a ='A';
				System.out.println("Value of a"+a);
				 int b=a;
				 System.out.println("value of int "+b);
				 float c=b;
				 System.out.println("value of float "+c);
				 
				 long d=b;
				 System.out.println("value of long "+d);
				 double e=a;
				 System.out.println("value of double "+e);
				 
				 System.out.println("Explicit type conversion");
				 double x=69.90;
				 int y =(int) x;
				 System.out.println("value of x "+x);
				 System.out.println("value of y "+y);
				 
				 double  p =89.0;
				 int q = (int)p;
				 System.out.println("value of p "+p);
				 System.out.println("value of q "+q);
				 
				 float  result =45.0f/7;
				 System.out.println("value of result "+result);
				 
				 
	}

}
