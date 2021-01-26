package Set1;

import java.util.Scanner;

public class FindTheSmallest {
	/*
	 * 		FIND THE SMALLEST WIHTOUT USING < AND > SYMBOL
	 * 
	 * 	Write a java program to find the smallest among a, b, c
	 *  without using < AND > symbol.
	 *  
	 *  For comparing two numbers we need to use the relational operator.
	 *  
	 *  The alternate idea is to find the divisor of a / b,
	 *  if result is 0 then a is small, else b is small
	 *  
	 *  Then apply same logic with the result like c / a or c / b 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		int a = scanner.nextInt();
		System.out.println("Enter the value of b ::");
		int b = scanner.nextInt();
		System.out.println("Enter the value of c ::");
		int c = scanner.nextInt();
		
		if(a/b==0) {
			//here a is smaller
			//now comapare it with c
			if(a/c==0) {
				System.out.println(a+" is smaller");
			}else {
				System.out.println(c+" is smaller");
			}
			
			
		}else {
			//here b is small
			//now comapare it with c
			if(b/c==0) {
				System.out.println(b+" is smaller");
			}else {
				System.out.println(c+" is smaller");
			}
		}

	}

}
