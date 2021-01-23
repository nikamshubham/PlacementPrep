package Set1;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String a,b="";
		System.out.print("Enter a word to check for palindrom - ");
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		System.out.println(a.length());	
		//Reverse string logic//
		for (int i = (a.length()-1); i >= 0; i--) {
			b = b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
	}

}
