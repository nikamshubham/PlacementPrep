 package SortingAlgo;

public class BubbleSort {
/*
 * Bubble Sort
 * ------------ 
 * Bubble sort, sometimes referred to as sinking sort, 
 * is a simple sorting algorithm that repeatedly steps 
 * through the list, compares adjacent elements and 
 * swaps them if they are in the wrong order. 
 * 
 * The pass through the list is repeated until the 
 * list is sorted. The algorithm, which is a comparison 
 * sort, is named for the way smaller or larger 
 * elements "bubble" to the top of the list.
 * 
 * Time Complexity 
 * ----------------
 * Worst Case : O(n^2)
 * Best Case : O(n)
 
*/
	public static void main(String[] args) {
		int[] A = {8,5,7,3,2};
		int temp,flag;
		//1st for loop for passes
		for(int i=0;i<A.length-1;i++) {
			flag=0;
			//2nd for loop for comparison and swapping  
			for(int j=0;j<A.length-i-1;j++) {
				if(A[j]>A[j+1])
				{
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					flag=1;
				}	
			}
			if(flag==0)
				break;

		}

		for(int a:A) {
			System.out.println(a);
		}
	}

}
