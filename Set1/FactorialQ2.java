package Set1;

public class FactorialQ2 {
	 static int factorial( int n ) {
	        if (n == 0)  // termination condition
	        	return 1;
	        else
	        	 return n * factorial(n-1); // recursive call
	    }
	public static void main(String[] args) {
		int no = 5;
		
		System.out.print("Factorial of a "+no+ " is ");
		
//		int fact=1;
//		for (int i = no; i >= 1; i--) {
//			fact = fact*i;
//		}
//		int i=1;
//		while (i<=no) {
//			fact = fact*i;
//			i++;
//		}
		
		int fact = factorial(no);
		System.out.print(fact);
	}

}
