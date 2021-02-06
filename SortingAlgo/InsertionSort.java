package SortingAlgo;

public class InsertionSort {

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
