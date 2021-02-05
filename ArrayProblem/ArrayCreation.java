package ArrayProblem;

public class ArrayCreation {

	public static void main(String[] args) {
		int[] arr; 	//Step 1 = declaration of array in java
		
		arr = new int[5];	//Step2 = Array construction need to mention size
		
		//Step3 = initialization of array.overriding values in the array by default for int 0 is already present
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		String[] s = {"Shubham","NIkam"};
		Object[] ab = s;
		
//		int[] => Object[] invalid promotion
//		int[] => long[] invalid promotion		
//		String[] => Object[] valid promotion
//		int[] => Object[] invalid promotion		
//		int[] ab1 = {90,60,30};
//		Object[] oo = ab1;
		
//		Wrapper class[] to Object[] is valid promotion
		Integer[] i = {10,20,30};
		Object[] oo= i;
		
	}

}
