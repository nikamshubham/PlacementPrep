package Set1;

import java.util.Scanner;

public class LargestNoQ10 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int ans = c> (a>b ? a: b)?c:((a>b)?a:b);
		//by ternnary operator
		System.out.println(ans);
		
	}

}
