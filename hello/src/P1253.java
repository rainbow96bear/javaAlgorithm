import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		
		int[] array = new int[N];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			array[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		
		int answer=0;
		
		for(int i=0;i<N;i++) {
			int start=0;
			int end=N-1;
			while(end>start) {
				int sum=array[start]+array[end];
				if(sum==array[i]) {
					if(start!=i&&end!=i) {
						answer++;
						break;
					}else if(start==i){
						start++;
					}else {
						end--;
					}
				}else if(sum<array[i]){
					start++;
				}else {
					end--;
				}
			}
			
		}
		System.out.println(answer);
	}
}