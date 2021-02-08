package Matrix;

public class Spiral_Traversal_Matrix {

	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		
		int rows = 4, columns = 4;
		
		int curRow = 0;
		int curCol = 0;
	
		System.out.println("Spiral form of the given matrix is ::");
		while(curRow < rows && curCol < columns){
			
			//print first row
			for(int i=curCol;i<columns;i++)
				System.out.print(matrix[curRow][i]+" ");
			curRow++;
			
			//print last column
			for(int i=curRow;i<rows;i++)
				System.out.print(matrix[i][rows-1]+" ");
			columns--;
			
			//print last row
			for(int i=columns-1;i>=curCol;i--)
				System.out.print(matrix[rows-1][i]+" ");
			rows--;
			
			//print first column
			for(int i=rows-1;i>=curRow;i--)
				System.out.print(matrix[i][curCol]+" ");
			curCol++;
		}
	}
}