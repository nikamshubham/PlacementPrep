package ArrayProblem;

public class freq_of_no_in_array {

	public static void main(String[] args) {
		int a[] = {0,5,5,5,4};
		int x = 5;
		
		int count = freq(a,x);
		
		for(int z:a){
			System.out.print(z+" ");
		}
		System.out.println();
		System.out.print("in this array "+x+" is ");
		System.out.println(count+" times");
	}

	private static int freq(int[] a, int x) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x)
				count++;
		}
		return count;
		
		
	}

}
