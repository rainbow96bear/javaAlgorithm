import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int inputLength = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] array=new int[inputLength];
		for(int i=0; i<inputLength; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1;i<inputLength;i++) {
			
			for(int j=0 ; j<i; j++) {
				
				if(array[j]>array[i]) {
					int temp = array[i];
					for(int k= i;k>j;k--) {
						array[k]=array[k-1];
					}
					array[j]=temp;
				}
			}

		}
		int[] sum = new int[inputLength];
		sum[0] = array[0];
		for(int i = 1; i<inputLength ; i++) {
			sum[i] = sum[i-1]+array[i];
		}
		int suM =0;
		for(int i = 0; i<inputLength ; i++) {
			suM += sum[i];
		}
		System.out.println(suM);
	}

}
