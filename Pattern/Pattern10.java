package Pattern;

public class Pattern10 {
	/*
	 * 	Write a Java Program to print the following Pattern
		1 2 3 4 5 6 
		  2 3 4 5 6 
		    3 4 5 6 
		      4 5 6 
		        5 6 
		          6 
		        5 6 
		      4 5 6 
		    3 4 5 6 
		  2 3 4 5 6 
		1 2 3 4 5 6 
	 */
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<i) {
					System.out.print(" ");
				}else if(j>=i){
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for(int k=2;k<=6;k++) {
			for(int l=1;l<=6;l++) {
				if(l<=6-k) {
					System.out.print(" ");
				}else {
					System.out.print(l);
				}
			}
			System.out.println();
		}
		

	}

}
