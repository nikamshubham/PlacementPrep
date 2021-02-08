package Matrix;

public class TransposeMatrix {
	/*
	 * Transpose of Matrix
	 * --------------------
	 * It is simply a flipped version of original matrix.
	 * Rows are the columns of original matrix
	 * Columns are the rows of the original matrix
	 * 
	 *  Say Matrix A is 
	 *  1 2 3
	 *  4 5 6
	 *  
	 *  Transpose of matrix A is AT 
	 *  1 4
	 *  2 5
	 *  3 6
	 */
	public static void main(String[] args) {
		int[][] A = {{1,2,3},
				     {4,5,6}};
		
		int row = A.length;
		int col = A[0].length;
		
		int colT = row;
		int rowT = col;
		
		int[][] T = new int[rowT][colT];
		
		for(int i=0;i<rowT;i++){
			for(int j=0;j<colT;j++)
				T[i][j] = A[j][i];
		}
		
		for(int y[]:T) {
			for(int z:y)
				System.out.print(z+" ");
			System.out.println();
		}
	}

}
