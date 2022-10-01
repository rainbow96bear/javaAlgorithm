import java.util.Arrays;
import java.util.Scanner;

public class P2343 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int start=0;
		int end = 0;
		for(int i = 0 ; i<N ; i++) {
			A[i]=sc.nextInt();
			end+=A[i];
			if(start<A[i]) {
				start=A[i];
			}
		}
		while(start<=end) {
			int m = (start+end)/2;
			int sum=0;
			int count=0;
			for(int i = 0 ; i<N ; i++) {
				if(sum+A[i]>m) {
					count++;
					sum=0;
				}
					sum+=A[i];
			}
			if(sum!=0) {
				
				count++;
			}
			if(count>M) {
				start = m+1;
			}else {
				end = m-1;
			}
		}
		System.out.println(start);
		
	}
}
