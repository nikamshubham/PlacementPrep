package Set1;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		System.out.println("Enter Year = ");
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		
 /* Leap Year Conditions
 * 1. Year should be divisible by 4
 * 2. If it is divisible by 100 then should be divisible by 400
 * 3. If both conditions are not satisfied, then given input is not leap year.*/
		if(yr%400==0) {
			System.out.println("leap year");
		}else if(yr%4==0 && yr%100!=0){
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}

	}

}
