package Set1;

public class Swap2NoQ7 {

	public static void main(String[] args) {
		int a=20,b=10,c;
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		* Approach 1::
		
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		///without using 3rd variable
		* Approach 2::
 		* using +, - operators
 		* a = 15, b = 20
 		*  
 		* a = a + b // after a = 35, b = 20
 		* b = a - b // after a = 35, b = 15
 		* a = a - b // after a = 20, b = 15 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped without using 3rd variable");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		* Approach 3::
 		* using ^ (XOR) operator
 		* a = 3, b = 10
 		* (0011) (1010)  
 		*  
 		* a = a ^ b // a = 0011 ^ 1010 = 1001
 		* b = a ^ b // b = 1001 ^ 1010 = 0011
 		* a = a ^ b // a = 1001 ^ 0011 = 1010
		//using ^ (XOR) operators
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
}
