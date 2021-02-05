package ArrayProblem;

public class ArryCreationInSingleLine {

	public static void main(String[] args) {
		//declaration,construction and initialization of a array in single line

		//one dimention array
		int[] arr = {10,20,30};
		for(int a: arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("=========================");
		//array of array and using for each loop traverse the array
		int[][] arr1 = {{10,20,30},{40,50,60}};
		for(int[] b: arr1) {
			for(int c: b) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		int[][] arr2 = new int[2][];
		arr2[0] = new int[4];
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[0][2] = 30;
		arr2[0][3] = 40;
		
		arr2[1] = new int[2];
		arr2[1][0] = 50;
		arr2[1][1] = 60;
		
		for(int a[]:arr2) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		int[][] arr3 = {{10,20,30,40},{50,60,70}};
		for(int a[]:arr3) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
				
		System.out.println("========================");
		
		
		int[][][] arr4 = {{{10,20},{30,40,50}},{{60}},{{70,80},{90,100,110},{120,130}}};
		
		for(int a[][]:arr4) {
			for(int b[]:a) {
				for(int c:b) {
					System.out.print(c+"| ");
				}
				System.out.println();
			}
			System.out.println("---");
		} 
		
		
	}

}
