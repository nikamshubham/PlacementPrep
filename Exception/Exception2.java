package Exception;

public class Exception2 {

	public static void main(String[] args) {
		Exception2 e = new Exception2();
			try {
				e.divide();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			System.out.println("Done");
	}
	
	public void divide() {
		
			int res = 10/0;
		
	}

}
