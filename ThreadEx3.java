package com.corejava.threads;

	public class ThreadEx3 implements Runnable{

		public static void main(String[] args) {
			
			System.out.println(Thread.currentThread());
			Thread.currentThread().setName("stella");
			System.out.println("id is:"+Thread.currentThread().getId());
			System.out.println(Thread.currentThread());
			System.out.println("priority is:"+Thread.currentThread().getPriority());
			System.out.println("main thread name is:"+Thread.currentThread().getName());
			ThreadEx3 thread=new ThreadEx3();
			Thread th=new Thread(thread);
			th.start();

			for(int i=1;i<10;i++) {
				System.out.println("main thread");
			}
		}
		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			Thread.currentThread().setName("sandy");
			Thread.currentThread().setPriority(10);
			System.out.println(Thread.currentThread().getId());
			System.out.println(Thread.currentThread());
			for(int i=1;i<10;i++) {
				System.out.println("child thread");
			}
			
		}

	}

