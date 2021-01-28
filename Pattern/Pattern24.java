package Pattern;

public class Pattern24 {
	/*
	Write the program to print the following pattern
	A
	B B
	C C C
	D D D D
	E E E E E
	*/
	public static void main(String[] args) {
		for(char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				if(j<=i) {
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
