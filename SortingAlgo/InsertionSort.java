package SortingAlgo;

public class InsertionSort {
/*
 * Insertion Sort
 * --------------
 * Insertion sort is the sorting mechanism where 
 * the sorted array is built having one item at a time. 
 * The array elements are compared with each 
 * other sequentially and then arranged simultaneously 
 * in some particular order.
 * 
 * It is much less efficient on large lists than 
 * more advanced algorithms such as quicksort, heapsort, 
 * or merge sort.
 * 
 * Time Complexity
 * ---------------
 * Worst Case : O(n^2)
 * Best Case : O(n)
 */
	public static void main(String[] args) {
		int[] a = {8,5,7,3,2,1};
		
		int i,j,x;
		//1st for loop for pass
		for(i=1;i<a.length;i++) {
			j = i-1;
			x = a[i];
		//to compare and swap
			while(j>-1 && a[j]>x) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = x;
		}
		
		for(int z:a) {
			System.out.println(z);
		}
	}

}
