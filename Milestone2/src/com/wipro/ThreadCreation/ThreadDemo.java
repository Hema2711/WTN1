package com.wipro.ThreadCreation;
import java.util.*;
public class ThreadDemo implements Runnable {
public void run()
{
	String colours[]= {"white","blue","black","green","red","yellow"};
	Random random=new Random();
	int index;
	while((index=random.nextInt(6))!=4)
	{
		System.out.println(colours[index]);
	}
}
public static void main(String[] args) {
	ThreadDemo td=new ThreadDemo();
	Thread t=new Thread(td);
	t.start();
}
}