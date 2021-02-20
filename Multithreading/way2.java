package Multithreading;
/*
which way is better implementing runnable interface or extending thread class.
implementing runnable interface is better because suppose if i have a class A which extending B
then i cannot create thread in this case because i cannot write like class A extends B,Thread
this is not allowed but class A extends B implements Runnable is allowed.
*/

//performing single task by single thread
//step1 - implement Runnable
public class way2 implements Runnable{

	//step2 - override run() of Runnable interface which is functional interface
	@Override
	public void run() {
		System.out.println("run method thread start");
	}
	public void start() {
		System.out.println("start method called");
	}
	
	public static void main(String[] args) {
		//step3 - create an object 
		way2 w = new way2();
		w.start();		//this will call above start method not thread class start()
		//pass the object as a parameter to thread class becuase runnable interface dont have start()
		Thread t = new Thread(w);
		//step4 - start the thread it will invoke thread
		t.start();	//this will call thread class start()
	}
}
