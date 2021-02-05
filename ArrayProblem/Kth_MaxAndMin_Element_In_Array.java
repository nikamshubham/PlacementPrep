package ArrayProblem;

import java.util.Scanner;

public class Kth_MaxAndMin_Element_In_Array {

	public static void main(String[] args) {
		
		int[] arr = {7,10,4,3,20,15};
		int length = arr.length;
		for(int a:arr)
			System.out.print(a+" ");
		
		System.out.println("length of array = "+length);
		
		System.out.print("Enter number less than array of length = ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(k);
		
		//first need to sort this array then we can easily find out kth max and min element
		
		
		
	}

}
