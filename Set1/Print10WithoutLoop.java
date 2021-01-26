package Set1;

public class Print10WithoutLoop {
	public static void PrintWithoutLoop(int n) {
		if(n <= 10){
			System.out.println(n);
			PrintWithoutLoop( n+1 );
		}
	}
	
	public static void main(String[] args) {
		PrintWithoutLoop(1);

	}

}
