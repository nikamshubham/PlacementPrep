package Pattern;

public class Pattern8 {
/*
111111
111122
111333
114444
155555
666666
 * */
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=6-i) {
					System.out.print("1");
				}else {
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
