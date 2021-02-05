package ArrayProblem;

public class MinMaxInArray {

	public static void main(String[] args) {
		int[] arr = {50,30,20,40,60};
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(min>arr[i]) {
				min = arr[i];
			}
			
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
	}

}
