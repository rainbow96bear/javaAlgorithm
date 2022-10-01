import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P2023{
	static ArrayList<Integer>[] A;
	static int N;
	static int checkNum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		
	}
	public static void DFS(int num, int jarisu) {
		if(jarisu==N) {
			if(check(num)) {
				System.out.println(num);
			}
			return;
		}
		for(int i =1;i<10;i++) {
			if(check(num*10+i)) {
				DFS(num*10+i,jarisu+1);
			}
		}
	}

	
	//소수검사 메서드
	public static boolean check(int a) {
		for(int i=2;i<=a/2;i++) 
			if(a%i==0)
				return false;
		return true;
	}
}
