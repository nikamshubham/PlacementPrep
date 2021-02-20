package Multithreading;
class Medical extends Thread{
	public void run() {
		try {
			System.out.println("medical starts");
			Thread.sleep(1000);
			System.out.println("medical Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class TestDrive extends Thread{
	
	public void run() {
		try {
			System.out.println("test drive starts");
			Thread.sleep(3000);
			System.out.println("test drive Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class OfficerSign extends Thread{
	
	public void run() {
		try {
			System.out.println("officer take file");
			Thread.sleep(3000);
			System.out.println("Officer sign the document");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class LicenseDemo {

	public static void main(String[] args) throws InterruptedException {
		Medical t1 = new Medical();
		t1.start();
		t1.join();
		TestDrive t2 = new TestDrive();
		t2.start();
		t2.join();
		OfficerSign t3 = new OfficerSign();
		t3.start();
		
	}

}
