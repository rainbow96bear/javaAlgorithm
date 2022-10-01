import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer  stringTokenizer = new StringTokenizer(bf.readLine());
		int size = Integer.parseInt(stringTokenizer.nextToken())+1;
		int askNum = Integer.parseInt(stringTokenizer.nextToken());
		int[] answer = new int[askNum];

		
		int [][] sum = new int [size][size];
		for (int i = 1; i<size;i++) {
			stringTokenizer=new StringTokenizer(bf.readLine());
			for(int j=1;j<size;j++) {
				sum[i][j]= sum[i][j-1]+Integer.parseInt(stringTokenizer.nextToken());
				
			}
		}
		for(int i = 0;i<askNum;i++) {
			stringTokenizer = new StringTokenizer(bf.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken()); //2
			int y1 = Integer.parseInt(stringTokenizer.nextToken()); //2
			int x2 = Integer.parseInt(stringTokenizer.nextToken()); //3
			int y2 = Integer.parseInt(stringTokenizer.nextToken()); //4
			for(int x = x1;x<=x2;x++) {
				
				answer[i]+=(sum[x][y2]-sum[x][y1-1]);
				System.out.println(answer[i]);
			}
		}
	}

}
