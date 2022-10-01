import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P2751 {
	static int[] array,temp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int arrayLength= Integer.parseInt(br.readLine());
		
		array = new int[arrayLength+1];
		temp=new int[arrayLength+1];
		for(int i = 1; i<=arrayLength ; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		merget(1,arrayLength);
		for(int i =1;i<=arrayLength;i++) {
			System.out.println(array[i]);
		}
		bw.flush();
		bw.close();
		
	}
	
	public static void merget(int s, int e) {
		if(e-s<1) {
			return;
		}
		int m = s+(e-s)/2;
		merget(s,m);
		merget(m+1,e);
		int k=s;
		int index1=s;
		int index2=m+1;
		while(index1<=m&&index2<=e) {
			if(array[index1]<array[index2]) {
				temp[k]=array[index1];
				k++;
				index1++;
			}else {
				temp[k]=array[index2];
				k++;
				index2++;
			}
		}
		while(index1<=m) {
			temp[k]=array[index1];
			k++;
			index1++;
		}
		while(index2<=e) {
			temp[k]=array[index2];
			k++;
			index2++;
		}
		for(int i=s;i<=e ;i++ ) {
			array[i]=temp[i];
		}
	}

}
