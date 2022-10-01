import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M=0;
		int sum = 0;
		int[] score = new int[N];
		do {
			for(int i=0;i<N;i++) {
				do {
					score[i]=sc.nextInt();
				}while(score[i]<0);
				
				sum +=score[i];
				if(score[i]>M) {
					M=score[i];
				}
			}
		}while(sum==0);
		
		
		double answer=((sum*100.0)/N)/M;
		
		System.out.println(answer);
		
	}

}
