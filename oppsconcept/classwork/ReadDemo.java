package com.simplilearn.classwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDemo
{
	public static void main(String[] args) 
	{
		FileWriter fwrite = null;
		BufferedWriter bwriter = null;
		
		String content = "hii welcome to java world";
		File file = new File("E:\\firstfile//firstfile");
		
		try
		{
			if(!(file.exists()))
			{
				file.createNewFile();
			}
		
			fwrite = new FileWriter(file,true);
			bwriter = new BufferedWriter(fwrite);
			bwriter.write(content);
			bwriter.close();
			System.out.println("file write completed");
			
			
		}	
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(fwrite != null)
				try
			{
					fwrite.close();
					
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			if(bwriter != null)
				try
			{
					bwriter.close();
					
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			
		}
		
		String data = "hii welcome to java world";
		File f1 = new File("E:\\firstfile//firstfile");
		
		
	
	}

}

