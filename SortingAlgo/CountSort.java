package SortingAlgo;

public class CountSort {

	public static void main(String[] args) {
		int[] arr = {6,3,9,10,15,6,8,12,3,6};
		int max = arr[0];
		int i,j;
		//step1 - find the max element in an array
		for(i=0;i<arr.length;i++) {
			if(max<arr[i])
				max = arr[i];
		}
		
		//step2 - create new array of size max element + 1 and initialize with 0
		int[] c = new int[max+1];
		
		//step3 - insert array value to new array index position if again same element found then increment 
		for(i=0;i<arr.length;i++) {
			c[arr[i]]++;
		}

		
//		for(int v:c)
//			System.out.print(v+" ");
		//i for c[] and j for arr[]
		i=0;
		j=0;
		//step4-now loop through count array check that value greater than 0 
		//if found then that index value override to orginal array from start position and increment
		while(i<max+1) {
			if(c[i]>0) {
				arr[j++]=i;
				c[i]--;
			}else
				i++;
		}
		
		for(int z:arr) {
			System.out.print(z+" ");
		}
		
	}

}
