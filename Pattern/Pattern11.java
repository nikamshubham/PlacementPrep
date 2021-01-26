package Pattern;

public class Pattern11 {
	/*
	Write a Java Program to print the following Pattern
	9 9 9 9 9 9 9 9 9
	  7 7 7 7 7 7 7
	    5 5 5 5 5
	      3 3 3
	        1
	*/
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j<i) {
					System.out.print(" ");
				}else if(j>=i) {
					System.out.print(j);
				}
			}
			for(int k=1;k<=4;k++) {
//				if(k>i) {
					System.out.print(" ");
//				}
			}

			System.out.println();
		}

	}

}
