package Set1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number - ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int temp = no;

		int rem,rev=0;
		while(temp!=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;			
		}
		System.out.println(rev);
		
		if(no==rev)
			System.out.println("Number is palindrome");
		else 
			System.out.println("Number is not palindrome");
	}
}
