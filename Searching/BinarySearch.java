package Searching;
/*
 * Binary Search
 * -------------- 
 * In computer science, binary search, also known as 
 * half-interval search is a search algorithm that 
 * finds the position of a target value within a sorted array.
 * 
 * Binary search compares the target value to the middle element 
 * of the array. If they are not equal, the half in which 
 * the target cannot lie is eliminated and the search continues 
 * on the remaining half, again taking the middle element 
 * to compare to the target value, and repeating this until 
 * the target value is found. If the search ends with the 
 * remaining half being empty, the target is not in the array.
 * 
 * Time Complexity
 * ----------------
 * Worst Case 	O(log n)
 * Best Case	O(1)
 * 
 * This search is faster than linear search.
 */
public class BinarySearch {

	public static void main(String[] args) {
		//to do binary search array must be in sorted order
		int array[] = { 10, 20, 30, 40, 50 };
		int key = 50;
		int index = binarySearch(array, key);
		if(index == -1)
			System.out.println("Element NOT found.");
		else
			System.out.println("Element found at index : "+index);

	}

	private static int binarySearch(int[] array, int key) {
		int leftindex = 0, rightindex = array.length-1;
		
		while(leftindex<=rightindex) {
			int mid = (leftindex+rightindex)/2;
			if(array[mid]==key)
				return mid;
			else if(array[mid] < key)
				leftindex = mid+1;
			else
				rightindex = mid-1;
		}
		
		return -1;
	}

}
/*
OUTPUT
array[] = { 10, 20, 30, 40, 50 }
key = 50
Element found at index : 4
OUTPUT
array[] = { 10, 20, 30, 40, 50 }
key = 100
Element NOT found.
*/
