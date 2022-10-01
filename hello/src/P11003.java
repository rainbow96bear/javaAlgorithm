import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11003 {
		public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int inputLength = Integer.parseInt(st.nextToken());
		
		int checkLength = Integer.parseInt(st.nextToken());
		int[] array2 = new int[checkLength];
		
		st = new StringTokenizer(bf.readLine()); 
		Deque<Node> checkDeque = new LinkedList<>();
		
		for(int i = 0; i<inputLength;i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!checkDeque.isEmpty()&&checkDeque.peekLast().value>now) {
					checkDeque.pollLast();
			}
			checkDeque.offerLast(new Node(i,now));
			if(checkDeque.peekFirst().index<=i-checkLength) {
				checkDeque.pollFirst();
			}
			
			System.out.printf("%d ", checkDeque.peekFirst().value);
		}
			
	}
	static class Node{
		public int index;
		public int value;
		
		public Node(int index,int value) {
			this.index=index;
			this.value=value;
		}
	}
}

