package Pattern;

public class Pattern25 {
	/*
	Write the program to print the following pattern
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	*/
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i)
					System.out.print(j);
			}
			System.out.println();
		}

	}

}
