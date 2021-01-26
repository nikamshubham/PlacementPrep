package Pattern;

import java.util.Scanner;

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
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n= sc.nextInt();
		int k=2*n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*n-1);j++) {
				if(j>=i && j<=(10-i)) {
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
			}
			k=k-2;
			System.out.println();
		}

	}

}
