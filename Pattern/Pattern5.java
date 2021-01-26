package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int temp=1;
			for(int j=1;j<=(2*i-1);j++) {
				if (j<i) {
					System.out.print(temp);
					temp++;
				} 
				else {
					System.out.print(temp);
					temp--;
				}
			}
			System.out.println();
		}

	}

}
