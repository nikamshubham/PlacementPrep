package Pattern;

public class Pattern28 {
	/*
	Write the program to print the following pattern
	A A A A A
	B B B B
	C C C
	D D
	E
	*/
	public static void main(String[] args) {
		for(char i='A';i<='E';i++) {
			for(char j='E';j>=i;j--) {
					System.out.print(i);
			}
			System.out.println();
		}

	}

}
