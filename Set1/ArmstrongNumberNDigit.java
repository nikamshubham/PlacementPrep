package Set1;

import java.util.Scanner;

public class ArmstrongNumberNDigit {

	public static void main(String[] args) {
		System.out.println("Enter a Number - ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		//first find length of digit
		//dont change original no because we need it at last for comparison
		int t1=no,len=0;
		while(t1!=0) {
			t1=t1/10;
			len=len+1;
		}
		
		//now each digit is multiply and add use reverse no logic
		int t2=no;
		int rem,arm=0;
		while(t2!=0) {
			rem = t2%10;
			int mul=1;
			for(int i=1;i<=len;i++) {
				mul=mul*rem;
			}
			arm = arm+mul;
			t2=t2/10;
		}
		if(arm==no)
			System.out.println(no+" is Armstrong no");
		else
			System.out.println(no+" is not Armstrong no");
		
	}
}
