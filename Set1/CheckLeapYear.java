package Set1;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		System.out.println("Enter Year = ");
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		
		if(yr%400==0) {
			System.out.println("leap year");
		}else if(yr%4==0 && yr%100!=0){
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}

	}

}
