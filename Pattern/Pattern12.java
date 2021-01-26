package Pattern;

import java.util.Scanner;

public class Pattern12 {
	/*
	Enter no of rows - 5
	*********
	 ******* 
	  *****  
	   ***   
	    * 
	    */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no of rows - ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*n-1);j++) {
				if(j>=i && j<=(10-i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
