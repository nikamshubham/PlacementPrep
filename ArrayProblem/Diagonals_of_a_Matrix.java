package ArrayProblem;

public class Diagonals_of_a_Matrix {

	public static void main(String[] args) {
		int n = 4;
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 } };
 
        printPrincipalDiagonal(a, n);
        System.out.println("==========");
        printSecondaryDiagonal(a, n);
	}

	private static void printSecondaryDiagonal(int[][] mat, int n) {
		int k = n - 1;
		   
		  for (int i = 0; i < n; i++) 
		  {
		    // Printing secondary diagonal
		    System.out.print(mat[i][k--] + ", ");
		  }
		  System.out.println();
		
	}

	private static void printPrincipalDiagonal(int[][] mat, int n) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				
//				if(i==j)
//					System.out.print(mat[i][j]);
//				else
//					System.out.print(mat[i][j]=0);
//			}
//			System.out.println("");	
//		}
		  for (int i = 0; i < n; i++) 
		  {
		    // Printing principal diagonal
		    System.out.print(mat[i][i] + ", ");
		  }
		  System.out.println();
		
	}

	
}
