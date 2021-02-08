package Matrix;

public class MatrixAddition {
/*
 * Add Two Matrix
 * ---------------
 * Addition is possible only when both A & B
 * matrices should have same dimensions, that is
 * both matrix should have same number of rows
 * and same number of columns. 
 * */
	public static void main(String[] args) {
		int[][] A = {{11,12,13,14},
					{15,16,17,18},
					{19,20,21,22},
					{23,24,25,26}};
//		int row1 = 4, col1 = 4;
		
		int[][] B = {{15,20,25,30},
				     {35,40,45,50},
				     {55,60,65,70},
				     {75,80,85,90}};
		
//		int row2 = 4, col2 = 4;
//		
//		if(row1 != row2 || col1 != col2){
//			System.out.println("Subtraction is not possible");
//			return;
		
		int result[][] = new int[4][4];
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				result[i][j] = A[i][j]+B[i][j];
			}
		}
		
		for(int y[]:result) {
			for(int z:y) {
				System.out.print(z+" ");
			}
			System.out.println();
		}

	}

}
