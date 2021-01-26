package Pattern;
/*
Write the program to print the following pattern
    1    
   333   
  55555  
 7777777 
999999999
*/
public class Pattern17 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j>=6-i && j<=4+i)
					System.out.print(n);
				else
					System.out.print(" ");
			}
			n=n+2;
			System.out.println();
		}

	}

}
