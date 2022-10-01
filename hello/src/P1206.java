import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1206 {
	static ArrayList<Integer>[] A;
	static Queue<Integer> queue = new LinkedList<>();
	static boolean[] visitedB;
	static boolean[] visitedD;
	static BufferedWriter bwD = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedWriter bwB = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int node = Integer.parseInt(st.nextToken());
		
		int adge = Integer.parseInt(st.nextToken());
		
		int start = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[node+1];
		for(int i = 0 ; i<=node ; i++) {
			A[i]=new ArrayList<>();
		}
		visitedD = new boolean[node+1];
		visitedB = new boolean[node+1];
		
		for(int i = 0 ; i<adge ; i++) {
			st= new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			A[k].add(l);
			A[l].add(k);
		}
		for(int i = 1 ; i<=node ; i++) {
			Collections.sort(A[i]);
		}
		
		DFS(start);
		BFS(start);
		bwD.flush();
		System.out.println();
		bwB.flush();
	}
	static void DFS(int s) throws IOException {
		
		if(visitedD[s]) {
			return;
		}
		bwD.append(s+" ");
		visitedD[s]=true;
		for(int i : A[s]) {
			if(!visitedD[i]) {
				DFS(i);
			}
		}
		
	}
	static void BFS(int s) throws IOException {
		
		if(visitedB[s]) {
			return;
		}
		bwB.append(s+" ");
		
		for(int i : A[s]) {
			if(!visitedB[i]) {
				queue.offer(i);
			}
		}
		visitedB[s]=true;
		while(!queue.isEmpty()) {
			BFS(queue.poll());
		}	
	}

}
