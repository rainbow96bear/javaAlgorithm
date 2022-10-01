import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1167 {
	static ArrayList<Edge>[] A;
	static boolean[] visited;
	static int[] distance;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		distance = new int[N+1];
		visited = new boolean[N+1];
		A = new ArrayList[N+1];
		for(int i = 0 ; i <=N ; i++) {
			A[i]=new ArrayList<>();
		}
		
		for(int i=0 ; i<N ; i++) {
			int startNode = sc.nextInt();
			while(true) {
				int arriveNode = sc.nextInt();
				if(arriveNode==-1) {
					break;
				}
				int length = sc.nextInt();
				A[startNode].add(new Edge(arriveNode,length));
			}
		}
		BFS(2);
		int MAX=1;
		for(int i = 1 ; i<=N ; i++) {
			if(distance[MAX]<distance[i]) {
				MAX=i;
			}
		}
		visited = new boolean[N+1];
		distance = new int[N+1];
		BFS(MAX);
		Arrays.sort(distance);
		System.out.println(distance[N]);
	}
	static void BFS(int s) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(s);
		while(!queue.isEmpty()) {
			int k = queue.poll();
			if(!visited[k]) {
				visited[k]=true;
				for(Edge i : A[k]) {
					if(!visited[i.e]) {
						queue.add(i.e);
						distance[i.e]=distance[k]+(i.value);
					}
				}
			}
		}
	}
	static public class Edge{
		int e;
		int value;
		public Edge(int e, int value) {
			this.e=e;
			this.value=value;
		}
	}
}
