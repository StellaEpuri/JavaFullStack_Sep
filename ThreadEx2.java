package com.corejava.threads;

public class ThreadEx2 extends Thread {

	public static void main(String[] args) {
		
		ThreadEx2 th2=new ThreadEx2();
		
		th2.start();//internally call the run()
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}

	}
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}

}
