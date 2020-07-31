package com.wipro.ThreadControlAndPriorities;

public class Delay implements Runnable{
	static Thread t1;
	public static void main(String[] args) {
		t1=new Thread(new Delay());
		t1.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			
				try
				{
					t1.sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(i);
			
		}
	}

}
