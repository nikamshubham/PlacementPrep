package Set1;

import java.util.Scanner;

public class PowerUsingRecursion {

	public static int pow(int base,int raisedTopower) {
		
		if(raisedTopower!=0)
			return (base * pow(base,raisedTopower-1));
		else
			return 1;
	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base number");
		int base = sc.nextInt();
		System.out.println("Enter a raised to power number");
		int raisedTopower = sc.nextInt();
		int result = pow(base,raisedTopower);
		System.out.println("Power = "+result);
		
	}

}
