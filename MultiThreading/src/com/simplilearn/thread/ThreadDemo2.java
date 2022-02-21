package com.simplilearn.thread;

public class ThreadDemo2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"is running");
		
	}

	public static void main(String[] args)
	{
		ThreadDemo2 d1 = new ThreadDemo2();
		
		Thread t1 = new Thread(d1);
		
		t1.start();
		

	}

}
