package Multithreading;
// performing multiple task from multiple thread so we need to create multiple run methods
class MyThread1 extends Thread{
	public void run() {
		System.out.println("task 1 - playing video");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		System.out.println("task 2 - playing audio");
		for(int i=5;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class Test {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		System.out.println(t1.getName());	//Thread-0
		t1.start();
		MyThread2 t2 = new MyThread2();
		System.out.println(t2.getName());	//Thread-1
		t2.start();
		//all threads executed at same time we cannot judge which thread will executed first its upto jvm 
	}
}
/*
output - we cannot predict the output multiple threads performing parellaly
task 1
task 2
1
2
5
3
4
5
6
7
8
9
10
 * */
