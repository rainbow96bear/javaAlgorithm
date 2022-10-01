import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178 {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int[][] A;
	static int N,M;
	static boolean[][] visited;
	static Queue<int[]> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		visited = new boolean[N][M];
		A = new int[N][M];
		for(int i = 0 ; i< N ; i++) {
			st=new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 0 ; j<M ; j++) {
				A[i][j]= Integer.parseInt(line.substring(j,j+1));
			}
		}
		BFS(0,0,1);
	}
	static void BFS(int s, int e,int n) {
		
		if(visited[s][e]) {
			return;
		}
		visited[s][e]=true;
		if(s==(N-1)&&e==(M-1)){
			System.out.println(n);
			while(!queue.isEmpty()) {
				queue.poll();
			}
			return;
		}
		
		int[] up ={1,-1,0,0};
		int[] right = {0,0,1,-1};
		
		for(int i = 0 ; i<4 ; i++) {
			int k = s+up[i];
			int l = e+right[i];
			if(0<=k&&0<=l&&k<N&&l<M) {
				if(A[k][l]==1&&!visited[k][l]) {
					int[] asdf= {k,l,n+1};
					queue.offer(asdf);
				}
			}
		}
		while(!queue.isEmpty()) {
			int[] as = queue.poll();
			if(!visited[as[0]][as[1]]) {
				BFS(as[0],as[1],as[2]);
			}
		}
	}
}

