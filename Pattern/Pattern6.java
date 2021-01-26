package Pattern;

public class Pattern6 {
	/*
	 * 	Write a Java Program to print the following Pattern
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2 
		1 
		1 2
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
		1 2 3 4 5 6
	 */
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=7-i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for(int i=2;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
