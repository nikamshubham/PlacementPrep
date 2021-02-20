package Multithreading;

class Mythread extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+" : "+Thread.currentThread().getName());	
			} catch (InterruptedException e) {
				System.out.println("exception in "+Thread.currentThread().getName()+" "+e);
			}
		}
	}
}
public class SleepMethodThreadExample {
/*
sleep() is a static method of thread class it stops the execution of thread for a few sec 
we must handle the checked exception because sleep() throws an InterruptedException
*/
	public static void main(String[] args){
//		for(int i=1;i<=5;i++) {
//			try {
//				Thread.sleep(2000);
//				System.out.println(i);	
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//			
//		}
		//now this will pause Thread-0 not main thread for 1 second
		Mythread m1 = new Mythread();
		m1.setName("Shubham");
		m1.start();
//		m1.run();
		
		Mythread m2 = new Mythread();
		m2.setName("Arpita");
		m2.start();
//		m2.run();

	}

}
/*
In case of m1.run() and m2.run() main will call normal overridden method and perform synchronisly for one object run() and then m2 object run()
output - 
1: main
2: main 
3: main
4: main
5: main
1: main
2: main 
3: main
4: main
5: main

*/
