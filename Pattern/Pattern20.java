package Pattern;
/*
Write the program to print the following pattern
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
*/
public class Pattern20 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int n=1;
			for(int j=1;j<=9;j++) {
				if(j>=(6-i) && j<=(4+i)) {
					System.out.print(n);
					n++;
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}

	}

}

