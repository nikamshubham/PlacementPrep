package Multithreading;

public class YieldMethod extends Thread{
	public void run() {
		Thread.yield(); //if you want Thread-0 to stop and provide main thread to execute
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	public static void main(String[] args) {
		YieldMethod t = new YieldMethod();
		t.start();
		
		Thread.yield();	//if you want main method to stop and provide other thread to execution
		for(int i=1;i<=5;i++) {	
			System.out.println(Thread.currentThread().getName());
		}
	}
}
