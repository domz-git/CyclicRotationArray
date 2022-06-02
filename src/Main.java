import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] a = {};
		int k = 4;
		
		solution(a, k);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] solution(int[] a, int k) {
		
		if(a.length == 0) {
			return a;
		}
		int n=0;
		while(n<k) {
			int x = a[a.length-1];
	        for (int i = a.length-1; i > 0; i--) {
	        	a[i] = a[i-1];
	        }
	       a[0] = x;
	    n++;
		}
		return a;
		
		
	}

}
