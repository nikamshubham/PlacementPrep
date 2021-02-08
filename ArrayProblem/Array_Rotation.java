package ArrayProblem;

public class Array_Rotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int d = 2;
		int[] ar1 = new int[2];
		int[] ar2 = new int[5];
		int temp;
		int m=0;
		for(int i=d-1;i>=0;i--) {
			ar1[m++] = arr[i];			
		}

		int k=0;
		for(int i=arr.length-1;i>=d;i--) {
			ar2[k++] = arr[i];
		}
		
		int l=0;			//0
		for(int j=ar2.length-1;j>=0;j--) {
			arr[l++] = ar2[j];
		}
		
		int i=arr.length-d; //5
		for(int j=ar1.length-1;j>=0;j--) {
			arr[i++] = ar1[j];
		}

		for(int z:arr) {
			System.out.print(z);
		}
	}

}
