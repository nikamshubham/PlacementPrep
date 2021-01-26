package Pattern;

public class Pattern13 {
/*
555555555
 4444444 
  33333  
   222   
    1  
 * */
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j>=i && j<=(10-i)) {
					System.out.print(n);
				}else {
					System.out.print(" ");
				}
			}
			n--;
			System.out.println();
		}

	}

}
