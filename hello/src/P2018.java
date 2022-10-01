import java.util.Scanner;

public class P2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer=0;
		int start=1;
		int end=1;
		int sum=1;
		while(end<=N) {
			if(sum==N) {
				answer++;
				end++;
				sum= sum+end;
			}else if(sum<N) {
				end++;
				sum=sum+end;
			}else {
				sum=sum-start;
				start++;
			}
		}
		
		
		System.out.println(answer);
	}
}
