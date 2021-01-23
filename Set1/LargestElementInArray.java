package Set1;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		System.out.println("Enter elements in an array - ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		
//		System.out.println(largest);
		for(int i=1;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest+" is the largest among all");
		
	}

}
