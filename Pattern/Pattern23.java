package Pattern;

public class Pattern23 {
	/*
	Write the program to print the following pattern
	*
	* *
	* * *
	* * * *
	* * * * *
	*/
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}


	}

}
