package Multithreading;
class Thr extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Test2 {

	public static void main(String[] args) {
//		Thread.currentThread().setDaemon(true);
	//as main thread already started so we cannot create it as daemon thread it will give exception
	//Exception in thread "main" java.lang.IllegalThreadStateException	
		
		System.out.println(Thread.currentThread().getId());	//1
		System.out.println(Thread.currentThread().getName());	//main
		System.out.println(Thread.currentThread().getPriority());//5
		Thread.currentThread().setName("Shubham");	//Shubham currentThread() static method 
		//currentThread() return ref and set name so if any exception occur it will give 
		//Exception in thread "Shubham"
//		System.out.println(10/0);
		/*
	Exception in thread "Shubham" java.lang.ArithmeticException: / by zero
	at Multithreading.Test2.main(Test2.java:12)
		 * */
		System.out.println(Thread.currentThread().isAlive());
		Thr t = new Thr();
//		t.setDaemon(true);
		t.start();
		
		
	}

}
