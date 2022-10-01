import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1517 {
	static int[] inputArray;
	static int[] temp;
	static int answer=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int arrayLength = Integer.parseInt(st.nextToken());
		
		inputArray = new int[arrayLength];
		temp= new int[arrayLength];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0 ; i<arrayLength ; i++)
		{
			inputArray[i]=Integer.parseInt(st.nextToken());
		}
		merget(0,arrayLength-1);
		

		System.out.println(answer);
		
	}
	public static void merget(int s, int e) {
		if((e-s)<1) {
			return;
		}
		int m = s+ (e-s)/2;
		merget(s,m);
		merget(m+1,e);
		int index1=s;
		int index2=m+1;
		int k=s;
		while(index1<=m&&index2<=e) {
			if(inputArray[index1]<=inputArray[index2]) {
				temp[k]=inputArray[index1];
				index1++;
				k++;
			}else {
				temp[k]=inputArray[index2];
				index2++;
				k++;
				answer+=(index2-k);
				
			}
		}
		while(index1<m+1) {
			temp[k]= inputArray[index1];
			k++;
			index1++;
		}
		while(index2<=e) {
			temp[k]=inputArray[index2];
			index2++;
			k++;
		}
		for(int i=s ; i<=e;i++) {
			inputArray[i]=temp[i];
		}
	}
	
}
