import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arrayLength = Integer.parseInt(st.nextToken());
		int[] ans=new int[arrayLength];
		Stack<Integer> s = new Stack<>();
		int[] checkArray = new int[arrayLength];
		st=new StringTokenizer(br.readLine());
		for(int i = 0 ; i < arrayLength; i ++ ) {
			checkArray[i]=Integer.parseInt(st.nextToken());
		}
		s.push(0);
		for(int i = 1; i<arrayLength; i++) {
			while((!s.isEmpty())&&(checkArray[s.peek()]<checkArray[i])) {
				ans[s.pop()]=checkArray[i];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			ans[s.pop()]=-1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i =0 ; i<arrayLength;i++) {
			bw.write(ans[i]+" ");
		}
		bw.write("\n");
		bw.flush();
	}
}
