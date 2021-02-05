package ArrayProblem;

import java.util.Scanner;

public class JavaArrayBasics {
/*
-Normally, an array is a collection of similar type of elements which has contiguous 
 memory location.
-Java array is an object which contains elements of a similar data type. Additionally, 
The elements of an array are stored in a contiguous memory location. It is a data structure 
where we store similar elements.
-Array in Java is index-based, the first element of the array is stored at the 0th index,2nd element 
at 1st index and so on..
-Unlike C/C++,in java we can get the length of the array using the length member. 
In C/C++, we need to use the sizeof operator. eg. sizeof(arr)/sizeof(arr[0]);
-Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.
*/
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args.getClass().getName());  //[Ljava.lang.String
		int[][] arr;	//declaration of array
		arr = new int[3][];//Construction of array
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr.length);
		
		int arr2[]= {50,40,60,20};
//		boolean[] f = new boolean[] {true,false};
//		System.out.println();
			
		System.out.println(arr.getClass().getName());	
		System.out.println(arr2.getClass().getName());
		System.out.println(arr.equals(arr2));
//or	int a[]={33,3,4,5}; declaration, instantiation and initialization
//or	int a[]=new int[] {10,20,30,40}; declaration, instantiation and initialization
		
//		Scanner sc= new Scanner(System.in);
//		for(int i=0;i<arr.length;i++) {		
//			arr[i] = sc.nextInt();
//		}
		
		//print the array
//		for(int x:arr) {
//			System.out.println(x);
//		}
		System.out.println("==================");
		
//Anonymous Array in Java-
//Java supports the feature of an anonymous array, so you don't need to declare the array
//while passing an array to the method.
		printArray(new int[]{10,22,44,66});//passing anonymous array to method  
		
	}

private static void printArray(int[] arr) {
	for(int x:arr) {
		System.out.println(x);
	}
	
}

}
