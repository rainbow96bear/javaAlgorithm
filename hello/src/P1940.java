import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			array[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		int answer=0;
		int start=0;
		int end=(N-1);
		do {
			int sum=array[start]+array[end];
			if(sum==M) {
				answer++;
				end--;
			}else if(sum<M) {
				start++;
			}else {
				end--;
			}
		}while(start!=end);
		System.out.println(answer);
		
	}

}
