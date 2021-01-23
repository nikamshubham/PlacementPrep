package Set1;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	public static int a=0,b=1,c;
	
	public static void main(String[] args) {
		
		FibonacciSeriesUsingRecursion obj = new FibonacciSeriesUsingRecursion();
		System.out.println("how many number you want to print = ");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		System.out.print(a+" "+b);
		obj.fib(c);

	}
	
	public void fib(int i) {
//		int a,b,c;
		if(i>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fib(i-1);	
		}
		
		
	}

}
