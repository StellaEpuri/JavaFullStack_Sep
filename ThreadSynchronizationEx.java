package com.corejava.threads;


class First {
	public synchronized void display(String msg)// [welcome][new][java programmer]
	{
		System.out.print("[" + msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second extends Thread// is-a
{
	String msg;// welcome,new
	First fobj;// has-a 

	Second(First fobj, String msg) {
		this.fobj = fobj;
		this.msg = msg;
		this.start();
	}
	public void run() {
		fobj.display(msg);// method calling
	}
}

public class ThreadSynchronizationEx {
	public static void main(String[] args) throws InterruptedException {
		First fnew = new First();

		Second ss = new Second(fnew, "welcome");
		ss.join();
		Second ss1 = new Second(fnew, "new");
		ss.join();
		Second ss2 = new Second(fnew, "java programmmer");

	}
}

