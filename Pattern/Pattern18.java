package Pattern;
/*
Write the program to print the following pattern
        A
      B B B
    C C C C C
  D D D D D D D
E E E E E E E E E
*/
public class Pattern18 {

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
			ch++;
			System.out.println();
		}
	}

}
