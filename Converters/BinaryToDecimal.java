package Converters;

import java.util.Scanner;

public class BinaryToDecimal {
	 /* Steps:
		 * given number n = 111
		 * 1. get the reminder of n by 10 (r=1)
		 * 2. multiply the reminder by power of 2
		 * 3. sum the multiplied output
		 * 4. update the n, divide n by 10
		 * 5. increment the power value
		 * 6. if n becomes 0, return sum as output
		 * 7. else continue from step 1
		 * till n reach 0 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		int binary = scanner.nextInt();
		int decimal = 0;
		int digitCount = 0;
		
		while( binary > 0){
			int unitDigit = binary % 10;
			binary = binary / 10;
			decimal += (unitDigit * Math.pow(2, digitCount));
			digitCount++;
		}
		
		System.out.println("The decimal value is : "+decimal);
		scanner.close();

	}

}
/*
OUTPUT
Enter the binary number : 1000
The decimal value is : 8
*/