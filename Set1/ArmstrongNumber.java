package Set1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int ono = sc.nextInt();
		int no = ono;
		int result = 0;
		while(no!=0) {
			int rem = no%10;
			
			result = (int) (result  + Math.pow(rem, 3));
			
			no = no/10;
				
		}
		if(result==ono)
			System.out.println(result+" is an armstrong number");
		else
			System.out.println(result+" is not an armstrong number");
		
	}
	
	
}
