package Set1;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 2; j < arr[i]-1; j++) {
				if(arr[i]%j == 0)
					count++;
			}
			
			if(count>0) {
				System.out.println(arr[i]+ " is not prime");
			}
			else {
				System.out.println(arr[i]+ " is prime");			
			}
			
		}
		
		
		
	}

}
