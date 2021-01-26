package Pattern;

public class Pattern7 {
	/*
	 
	1
	2 1
	3 2 1
	4 3 2 1
	5 4 3 2 1 
	6 5 4 3 2 1
	
	*/
	public static void main(String[] args) {
		int temp;
		for(int i=1;i<=6;i++) {
			temp = i;
			for(int j=1;j<=6;j++) {
				if(temp>0) {
					System.out.print(temp);
					temp--;
				}
			}
			System.out.println();
		}

	}

}
