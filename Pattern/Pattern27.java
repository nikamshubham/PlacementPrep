package Pattern;

public class Pattern27 {
	/*
	Write the program to print the following pattern
	1 1 1 1 1
	2 2 2 2
	3 3 3
	4 4
	5
	*/
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=6-i)
					System.out.print(i);
			}
			System.out.println();
		}

	}

}
