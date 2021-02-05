package Converters;

import java.util.Scanner;

public class DecimalToBinary {
	 	/* Steps:
		 * 1. divide the decimal and get reminder
		 * 2. multiply the reminder by 10 power i(i=0)
		 * 3. update the decimal by divide by 2
		 * 4. divide the decimal and get reminder
		 * 5. increment the power value by 1
		 * 6. multiply the reminder by 10 power i(i=1)
		 * 6. sum the multiplication result
		 * 7. continue the steps upto n > 0
		 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the decimal value : ");
		int decimal = scanner.nextInt();
		long binary = 0;
		int i = 0;
		
		//reverse logic
		while (decimal > 0){
			int reminder = decimal %2;
			decimal = decimal / 2;
			binary += ( reminder * Math.pow(10, i));
			i++;
		}
		System.out.println("Binary value is : "+binary);
		
		scanner.close();	

	}

}
/*
OUTPUT
Enter the decimal value : 31
Binary value is : 11111

Enter the decimal value : 32
Binary value is : 100000

Enter the decimal value : 7
Binary value is : 111
*/
