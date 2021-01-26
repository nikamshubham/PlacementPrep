package Set1;

import java.util.Scanner;

public class SumofDigitofNumber {
	//This program will calculate the sum of digits of a given number
	/*
	 * say N = 153
	 * output is = 9 (1 + 5 + 3)
	 * 
	 * say N = 1986
	 * output is = 24 (1 + 9 + 8 + 6)
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number - ");
		int n = sc.nextInt();
		int sum=0;
		while(n!=0) {
			int rev = n%10;
			sum+=rev;
			n=n/10;
		}
		System.out.println(sum);
		sc.close();

	}

}
