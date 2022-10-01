import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P13023{
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int answer=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int people = Integer.parseInt(st.nextToken());
		int friend = Integer.parseInt(st.nextToken());
		A =new ArrayList[people];
		for(int i = 0 ; i < people ; i++) {
			A[i]= new ArrayList<>();
		}
		visited =new boolean[people];
		for(int i = 0 ; i<friend ; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			A[k].add(l);
			A[l].add(k);
		}
		
		for(int i = 0 ; i<people ; i++) {
			DFS(i,1);
		}
        System.out.println(answer);
	}
	public static void DFS(int s, int depth) {
		if(depth!=5) {
			if(visited[s]) {
				return;
			}
			visited[s]=true;
			for(int i : A[s]) {
				if(!visited[i]){
				    DFS(i,depth+1);
                }
			}
		}else {
			answer=1;
		}
        visited[s]=false;
	}
}
