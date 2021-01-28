package Pattern;

public class Pattern22 {
	/*
	Write the program to print the following pattern
	A
	A B
	A B C
	A B C D
	A B C D E
	*/
	public static void main(String[] args) {
		for(char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				if(j<=i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
