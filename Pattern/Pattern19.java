package Pattern;
/*
Write the program to print the following pattern
        A
      C C C
    E E E E E
  G G G G G G G
I I I I I I I I I
*/
public class Pattern19 {

	public static void main(String[] args) {
		char ch = 'A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j>=(6-i) && j<=(4+i)) {
					System.out.print(ch+"");
				}else {
					System.out.print(" ");
				}
			}
			ch+=2;
			System.out.println();
		}

	}

}
