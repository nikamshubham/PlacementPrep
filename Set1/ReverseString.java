package Set1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.print("Enter a word - ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int len = a.length();
		String b = "";
		for (int i = len-1; i >= 0; i--) {
			b = b +  a.charAt(i);
		}
		
		System.out.println("Reverse of String = "+b);
	}

}
