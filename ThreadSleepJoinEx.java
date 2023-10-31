package com.corejava.threads;

public class ThreadSleepJoinEx implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		ThreadSleepJoinEx th=new ThreadSleepJoinEx();
		
		Thread thread=new Thread(th);
		
		thread.start();
		
		thread.join();
		
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("main thread");
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
		
	}

}
