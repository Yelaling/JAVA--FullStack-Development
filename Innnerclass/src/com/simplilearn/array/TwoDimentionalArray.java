package com.simplilearn.array;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
	        //lets store elements in matrix
	        int array[][]=new int[2][2];//{{1,2,3},{4,2,3},{8,5,6}}
	        for(int row=0;row<2;row++)
	        {
	            for(int col=0;col<2;col++)
	            {
	                System.out.println("Enter Element");
	                array[row][col]=sc.nextInt();
	            }
	        }
	        Scanner sc1=new Scanner(System.in);
	        //lets store elements in matrix
	        int array1[][]=new int[2][2];//{{1,2,3},{4,2,3},{8,5,6}}
	        for(int row=0;row<2;row++)
	        {
	            for(int col=0;col<2;col++)
	            {
	                System.out.println("Enter Element");
	                array1[row][col]=sc1.nextInt();
	            }
	        }
	        
	        System.out.println("Let's Print elements");
	        for(int row=0;row<2;row++)
	        {
	            for(int col=0;col<2;col++)
	            {
	                System.out.print(array[row][col]+"\t");
	            }
	            
	            System.out.println();
	        }
	        System.out.println("Let's Print elements");
	        for(int row=0;row<2;row++)
	        {
	            for(int col=0;col<2;col++)
	            {
	                System.out.print(array[row][col]+"\t");
	            }
	            
	            System.out.println();
	        }
	        
	}

}
