import java.util.Scanner;

public class SumOfSection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int M;
		int start;
		int end;
		int answer;
		do {
			N = sc.nextInt();
		}while(!(N>0&&N<100000));
		do {
			M = sc.nextInt();
		}while(!(M>0&&M<100000));
		int[] array = new int[N];
		int[] sum = new int[N];
		for(int i = 0 ; i<array.length;i++) {
			do {
				array[i]=sc.nextInt();
		
			}while(!(array[i]>0&&array[i]<1001));
		}
		/*
		 1 2 3 4 5
		 0 1 2 3 4
		 5 4 3 2 1
		 5 9 12 14 15 
		 */
		for(int i =0;i<N;i++) {
			if(i==0) {
				sum[i]=array[i];
			}else {
				sum[i]=sum[i-1]+array[i];
			}
		}
		for(int i=0;i<M;i++) {
			do {
				start = sc.nextInt();
				end = sc.nextInt();
			}while(start>end);
			if(start==1) {
				System.out.println(sum[end-1]);
			}else {
				answer=sum[end-1]-sum[start-2];
				System.out.println(answer);
			}
		}		
	}
}
