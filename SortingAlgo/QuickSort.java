package SortingAlgo;

public class QuickSort {
/*
Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.
A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, 
based on which the partition is made and another array holds values greater than the pivot value.
Quicksort partitions an array and then calls itself recursively twice to sort the two resulting subarrays. 

Worst complexity: n^2
Average complexity: n*log(n)
Best complexity: n*log(n)
Method: Partitioning
Stable: No
*/
	public static void main(String[] args) {
		int A[]={11,13,7,12,16,9,24,5,10,3},n=10,i;
		
		Sort(A,0,9);
		
		System.out.print("the sorted array is = ");
		for(int a:A) {
			System.out.print(a+" ");
		}

	}
	
	public static void Sort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        Sort(arr, begin, partitionIndex-1);
	        Sort(arr, partitionIndex+1, end);
	    }
	}
	
	public static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}


}
