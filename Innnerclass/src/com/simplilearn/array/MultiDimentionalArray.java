package com.simplilearn.array;

import java.util.Scanner;

public class MultiDimentionalArray {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
	        //lets store elements in matrix
	        int array[][]=new int[3][3];//{{1,2,3},{4,2,3},{8,5,6}}
	        for(int row=0;row<3;row++)
	        {
	            for(int col=0;col<3;col++)
	            {
	                System.out.println("Enter Element");
	                array[row][col]=sc.nextInt();
	            }
	        }
	        
	        System.out.println("Let's Print elements");
	        for(int row=0;row<3;row++)
	        {
	            for(int col=0;col<3;col++)
	            {
	                System.out.print(array[row][col]+"\t");
	            }
	            
	            System.out.println();
	        }
	    }
	}


	


