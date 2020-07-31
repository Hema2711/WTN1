package com.wipro.ThreadControlAndPriorities;

public class ThreeThreads implements Runnable  {
	

		public static void main(String[] args) {
			ThreeThreads tt = new ThreeThreads();
			
			Thread t1 = new Thread(tt, "Thread1");
			Thread t2 = new Thread(tt, "Thread2");
			Thread t3 = new Thread(tt, "Thread3");
			
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.MIN_PRIORITY);
			t3.setPriority(Thread.NORM_PRIORITY);
			
			t1.start();
			t2.start();
			t3.start();
		}
		
		public void run() {
			for (int i=0;i<10;i++)
				System.out.println(Thread.currentThread().getName() + ": " + i);		
		}

	}


