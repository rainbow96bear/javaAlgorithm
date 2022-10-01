import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {
	static ArrayList<Integer>[] al;
	static int nodeNum;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		nodeNum = Integer.parseInt(st.nextToken());
		int adgeNum = Integer.parseInt(st.nextToken());
		al = new ArrayList[nodeNum+1];
		int k;
		int l;
		visited = new boolean[nodeNum+1];
		int answer=0;
		for(int i = 1; i<=nodeNum ; i++) {
			al[i]=new ArrayList<Integer>();
		}
		for(int i = 1 ; i<=adgeNum ; i++) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			al[k].add(l);
			al[l].add(k);
		}
	
		for(int i = 1; i<=nodeNum ; i++) {
			if(visited[i]==false){
				answer++;
				DFS(i);
			}
		}
		
		System.out.println(answer);
	}
	public static void DFS(int v) {
		if(visited[v]!=false){
			return;
		}
		visited[v]=true;
		for(int i : al[v]) {
			if(visited[i]==false){
				DFS(i);
			}
		}
	}
}
