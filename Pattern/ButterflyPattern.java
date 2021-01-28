package Pattern;

public class ButterflyPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
				for(int j=1;j<=8;j++) {
					if(j<=i || j>=(9-i)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
		}
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=8;b++) {
				if (b<=(5-a) || b>=(4+a)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
