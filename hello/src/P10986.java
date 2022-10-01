import java.util.Scanner;

public class P10986{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[N];
        
        
        int answer=0;
        int[] C = new int[M];
        
        S[0]= sc.nextInt();
        for(int i = 1 ; i<N ; i++){
            S[i]= S[i-1]+sc.nextInt();
        }
        for(int i = 0; i<N ; i++){
            int result=(S[i]%M);
            if(result==0){
                answer++;
            }
            C[result]++;
        }
        for(int i = 0 ; i<M ; i++){
            if(C[i]>1){
                answer = answer + (C[i]*(C[i]-1)/2);
            }
        }
        System.out.println(answer);
	}

}
