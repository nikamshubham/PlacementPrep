package ArrayProblem;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int start = 0;
		int end = arr.length-1;
//		System.out.println(start+" "+end);
		int temp;
		for(int i=start;i<=end;i++) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	

	}

}
