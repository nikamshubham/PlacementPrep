package Multithreading;
class Aptitude extends Thread{
	public void run() {
		try {
			System.out.println("Solve Aptitude");
			Thread.sleep(2000);
			System.out.println("Aptitude Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class Technical extends Thread{
	public void run() {
		try {
			System.out.println("Technical Interview Start");
			Thread.sleep(3000);
			System.out.println("Technical Interview Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class HR extends Thread{
	public void run() {
		try {
			System.out.println("HR Called");
			Thread.sleep(1000);
			System.out.println("Selected by Company");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	
}

public class JoinMethodExample {

	public static void main(String[] args) throws InterruptedException {
			Aptitude a = new Aptitude();
			a.start();
			a.join();
			//here main thread wait for aptitude thread to complete its task
			
			Technical t = new Technical();
			t.start();
			t.join();
			//here main thread wait for Technical thread to complete its task
			
			HR h = new HR();
			h.start();
	}

}
/*
output - 
Solve Aptitude
Aptitude Completed
Technical Interview Start
Technical Interview Completed
HR Called
Selected by Company 
*/
