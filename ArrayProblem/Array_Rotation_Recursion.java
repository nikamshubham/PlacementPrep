package ArrayProblem;

public class Array_Rotation_Recursion {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int d= 2;
		leftrotate(arr,d);
		printArray(arr);

	}

	private static void leftrotate(int[] arr, int d) {
		if(d<0)
			return;
		
		int n = arr.length;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
	}
	

	private static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

	private static void printArray(int[] arr) {
		for(int z:arr) {
			System.out.print(z+" ");
		}
		
	}

	
}
