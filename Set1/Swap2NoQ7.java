package Set1;

public class Swap2NoQ7 {

	public static void main(String[] args) {
		int a=20,b=10,c;
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped without using 3rd variable");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
