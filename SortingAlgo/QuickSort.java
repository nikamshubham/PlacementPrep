package SortingAlgo;

public class QuickSort {

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
