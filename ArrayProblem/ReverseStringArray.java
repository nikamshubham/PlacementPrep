package ArrayProblem;

public class ReverseStringArray {

	public static void main(String[] args) {
		String[] s = {"d","c","b","a"};
		
		int start = 0;
		int end = s.length-1;
		
		while(start<end) {
			String temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		for(String a:s) {
			System.out.print(a+" ");
		}
	}
}

//Output = a b c d 