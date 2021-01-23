package Set1;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		//WAP to Check Prime Number using loop?
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int no = sc.nextInt();
		int count=0,i;
		for (i = 2; i <= no-1; i++) {
			if(no%i==0)
				count++;
		}
		if (count==0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		
	}

}
