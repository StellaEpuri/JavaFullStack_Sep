package com.corejava.threads;

public class ThreadEx1 implements Runnable {

	public static void main(String[] args) {
		
		ThreadEx1 thread=new ThreadEx1();
		
		Thread th1=new Thread(thread);
		
		th1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}

	}

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}

}
