package ArrayProblem;

import java.util.Scanner;

public class three_by_three_matrix {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("3d array is - ");
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		


	}

}
