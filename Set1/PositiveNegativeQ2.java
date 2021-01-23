package Set1;

import java.util.Scanner;

public class PositiveNegativeQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number - ");
		int no = sc.nextInt();
		
		if(no>=0)
			System.out.println(no +" is positive");
		else
			System.out.println(no+" is negative");
		
		
	}

}
