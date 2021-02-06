package SortingAlgo;

public class SelectctionSort {

	public static void main(String[] args) {
		int[] A = {8,6,3,2,5,4};
		int i,j,k,temp;
		
		//1st for loop for passes of i from 0 to n-1
		for(i=0;i<A.length;i++) {
			//2nd for loop for comparison and swap between j and k..k points to smallest element
			for(j=k=i;j<A.length;j++) {
				if(A[k]>A[j])
					k=j;
			}
			//swap A[i] with A[k] so after k pass k elements are sorted
			temp = A[i];
			A[i] = A[k];
			A[k] = temp;
		}

	for(int arr:A) {
		System.out.print(arr+" ");
	}

	}

}
