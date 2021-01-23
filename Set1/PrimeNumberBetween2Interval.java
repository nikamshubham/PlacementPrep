package Set1;

import java.util.Scanner;

public class PrimeNumberBetween2Interval {

	public static void main(String[] args) {
		
		System.out.println("Enter 1st interval - ");
		Scanner sc = new Scanner(System.in);
		int start,end;
		start = sc.nextInt();
		System.out.println("Enter last interval - ");
		end = sc.nextInt();
		
		while(start<=end) {
			int count = 0;
			for (int i = 2; i < start; i++) {
				
				if(start%i==0)
					count++;
				
			}
			if(count>0)
				System.out.println(start+" is not a prime number");
			else
				System.out.println(start+" is prime number");	
			start++;
		}
	}

}
