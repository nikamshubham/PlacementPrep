package Set1;

import java.util.Scanner;

public class VowelConsonantQ9 {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
//		System.out.println(ch);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonent");
		}

	}

}
