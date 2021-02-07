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
In the implementation below, the following components have been used: Here,

A[]  = array whose elements are to be sorted

start: Leftmost position of the array

end: Rightmost position of the array

i : Boundary between the elements that are less than pivot and those greater than pivot

j : Boundary between the partitioned and unpartitioned part of array

piv : Pivot element
*/
	public static void main(String[] args) {
		int A[]={11,13,7,12,16,9},n=6,i;
		
		quick_sort(A,0,n-1);
		
		System.out.print("the sorted array is = ");
		for(int a:A) {
			System.out.print(a+" ");
		}
	}
	
	static void quick_sort ( int A[ ] ,int start , int end ) {
		   if( start < end ) {
		        //stores the position of pivot element
		         int piv_pos = partition (A,start , end ) ;     
		         quick_sort (A,start , piv_pos -1);    //sorts the left side of pivot.
		         quick_sort ( A,piv_pos +1 , end) ; //sorts the right side of pivot.
		   }
		}
	
	static int partition ( int A[],int start ,int end) {
	    int i = start + 1,temp;
	    int piv = A[start] ;            //make the first element as pivot element.
	    for(int j =start + 1; j <= end ; j++ )  {
	    /*rearrange the array by putting elements which are less than pivot
	       on one side and which are greater that on other. */

	          if ( A[ j ] < piv) {
	        	  temp = A[i];
	        	  A[i] = A[j];
	        	  A[j] = temp;
//	        	  swap (A[ i ],A [ j ]);
	            i += 1;
	        }
	   }
	  temp = A[start];
  	  A[start] = A[i-1];
  	  A[i-1] = temp;
//	   swap ( A[ start ] ,A[ i-1 ] ) ;  //put the pivot element in its proper place.
	   return i-1;                      //return the position of the pivot
	}
}
