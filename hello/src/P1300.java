import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][N];
		
		int[] B = new int[N*N];
	
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				A[i][j]=(i+1)*(j+1);
				B[N*i+j]=A[i][j];
			}
		}
		Arrays.sort(B);
		System.out.println(B[k-1]);
	}
}
