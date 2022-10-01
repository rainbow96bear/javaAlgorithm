import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P10989 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputLength = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] inputArray = new int[inputLength];
		for(int i = 0 ; i<inputLength ; i++) {
			st= new StringTokenizer(br.readLine());
			inputArray[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(inputArray);
		for(int i = 0 ; i<inputLength ; i++) {
			System.out.println(inputArray[i]);
		}
	}
}
