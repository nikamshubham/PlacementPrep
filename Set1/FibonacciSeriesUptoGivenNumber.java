package Set1;

public class FibonacciSeriesUptoGivenNumber {

	public static void main(String[] args) {
		int t1=0,t2=1,no=20,t3;
		
		
		
		while(t1<=no)
		{
			System.out.print(t1+" + ");
			t3=t1+t2;
//			System.out.print(t3+"+");
			t1=t2;
			t2=t3;
		}
		
		
	}

}
