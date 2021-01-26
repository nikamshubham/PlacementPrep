package Pattern;

public class Pattern3 {
	/*
	 * 	Write a Java Program to print the following Pattern
		6 5 4 3 2 1
		6 5 4 3 2 
		6 5 4 3 
		6 5 4
		6 5
		6
	 */
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=1;j--) {
				if(j>=i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
