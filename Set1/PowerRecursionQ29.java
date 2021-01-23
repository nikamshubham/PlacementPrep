package Set1;

public class PowerRecursionQ29 {

	public static void main(String[] args) {
		 int n=4;
		 int ans = power(n);
		 System.out.println(ans);
	}
	
	public static int power(int n) {
		int ans=1;
		for (int i = 0; i < n; i++) {
			ans = ans*n;
		}
		return ans;
	}

}
