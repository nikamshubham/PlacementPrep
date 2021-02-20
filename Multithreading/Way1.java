package Multithreading;

public class Way1 extends Thread{
	public int count;
	public void run() {
		System.out.println("performing thread task");
	}	
	
	public static void main(String[] args) {
	//performing single task from multiple thread t1,t2 etc..	
		Way1 t1 = new Way1();
			t1.start();
		Way1 t2 = new Way1();	
			t2.start();
	}
}
/*
op - 
performing thread task
performing thread task 

interview question here how many threads created - 3 threads - main,t1 and t2
JVM creates main thread
*/
