package Pattern;

public class Pattern9 {
	/*
	 * 	Write a Java Program to print the following Pattern
		1
		1 0
		1 0 1
		1 0 1 0
		1 0 1 0 1
		1 0 1 0 1 0  
	 */
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=i) {
					if(j%2!=0)
						System.out.print("1");
					else
						System.out.print("0");	
				}

			}
			System.out.println();
		}

	}

}
