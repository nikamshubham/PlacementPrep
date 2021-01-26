package Pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("ENter no of rows to print - ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
/*
ENter no of rows to print - 2
11111
22222

ENter no of rows to print - 5
11111
22222
33333
44444
55555

*/

