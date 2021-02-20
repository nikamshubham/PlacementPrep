package Multithreading;

public class JoinMethodThread extends Thread{
	static Thread mainthread;
	public void run() {
		try {
//			mainthread.join();
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" - "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread mainthread = Thread.currentThread();
		JoinMethodThread t = new JoinMethodThread();	
		t.start();
		
		t.join();
/* here main thread stop and wait for Thread-0 to complete its execution and join that 
   thread afterwards. 
*/
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(1000);
				
			}
		} catch (Exception e) {
				System.out.println(e);
		}
	}
}
