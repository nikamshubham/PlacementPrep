package SortingAlgo;

public class MergeSort {

	public static void main(String[] args) {
		int[] A = {38, 27, 43, 3, 9, 82, 10, 20};
		int n = A.length;
		merge_sort(A,0,n-1);
		System.out.println("\nSorted array");
        printArray(A);
        
        for(int ans:A) {
        	System.out.print(ans+" ");
        }
	}

	private static void printArray(int[] a) {
		for(int result:a) {
			System.out.print(result+" ");
		}
		
	}

	private static void merge_sort(int[] A,int lb, int ub) {
		int mid;
		if(lb<ub) {
			 // Find the middle point
			mid = (lb+ub)/2;
			
			 // Sort first and second halves
			merge_sort(A,lb,mid);
			merge_sort(A,mid+1,ub);
			
			// Merge the sorted halves
			merge(A,lb,mid,ub);
		}
	}

	// Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
	private static void merge(int[] A, int lb, int mid, int ub) {
		//int i=lb,j=mid+1;
		//int k=lb;
		int l = mid-lb +1;
		int r = ub - mid;
		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r]; 
		
		for (int i=0; i<l; ++i)  
			LeftArray[i] = A[lb + i];  
			  
		for (int j=0; j<r; ++j)  
			RightArray[j] = A[mid + 1+ j];  
		//int B[] ; 	//create new array of size A for store sorted array
		
		int i = 0,j = 0;
		int k = lb;
		while(i<l && j<r) {
			if(LeftArray[i]<RightArray[j]) {
				A[k] = LeftArray[i];
				i++;
			}else {
				A[k] = RightArray[j];
				j++;
			}
			k++;
		}
		
		while (i<l)  
		{  
			A[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
		  
		while (j<r)  
		{  
			A[k] = RightArray[j];  
			j++;  
			k++;  
		}  

//transfer all elements of B into A
//		for(k = lb;k<=ub;k++) {
//			A[k] = B[k];
//		}
		
	}
	
}
