import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
	
	public static void main(String[] args) {
		int[] inputArray;
		int[] checkArray;
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		
		inputArray = new int[N];
		for(int i = 0 ; i<N ; i++) {
			inputArray[i] = sc.nextInt();
		}
		
		Arrays.sort(inputArray);
		int M = sc.nextInt();
		
		checkArray = new int[M];
		
		for(int i = 0 ; i<M ; i++) {
			checkArray[i]=sc.nextInt();
		}
		
		for(int i = 0 ; i < M ; i++) {
			boolean check=false;
			int s=0;
			int e=N-1;
			while(!check){
				int m = (s+e)/2;
				
				if(checkArray[i]<inputArray[s]||checkArray[i]>inputArray[e]) {
					break;
				}
				if(inputArray[m]==checkArray[i]) {
					check=true;
				}
				else if(inputArray[m]>checkArray[i]) {
					e=m-1;
				}else {
					s=m+1;
				}
			}
			if(check) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
