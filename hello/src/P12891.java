import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P12891 {

	static char[] charArray;
	static int[] ok;
	static int pw = 0;
	static int[] check;
	
	public static void remove(int i) {
		switch (charArray[i]) {
		case 'A' : ok[0]--;
		if(ok[0]==check[0]-1) {
			pw--;
		}
		break;
		
		case 'C' : ok[1]--;
		if(ok[1]==check[1]-1) {
			pw--;
		}
		break;
		
		case 'G' : ok[2]--;
		if(ok[2]==check[2]-1) {
			pw--;
		}
		break;
		
		case 'T' : ok[3]--;
		if(ok[3]==check[3]-1) {
			pw--;
		}
		break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int inputLength = Integer.parseInt(st.nextToken());
		int pwLength= Integer.parseInt(st.nextToken());
		
		int answer=0;
		
		charArray = new char[inputLength];
		ok = new int[4];
		charArray=bf.readLine().toCharArray();
		

		st = new StringTokenizer(bf.readLine());
		check = new int[4];
		for(int i = 0; i<4 ; i++) {
			check[i]=Integer.parseInt(st.nextToken());
			if(check[i]==0) {
				pw++;
			}
		}
		
		for(int i = 0 ; i<pwLength; i ++) {
			switch (charArray[i]) {
					case 'A' : ok[0]++;
					if(ok[0]==check[0]) {
						pw++;
					}break;
					
					case 'C' : ok[1]++;
					if(ok[1]==check[1]) {
						pw++;
					}break;
					
					case 'G' : ok[2]++;
					if(ok[2]==check[2]) {
						pw++;
					}break;
					
					case 'T' : ok[3]++;
					if(ok[3]==check[3]) {
						pw++;
					}break;
			}
			
		}
		if(pw==4) {
			answer++;
		}	
		for(int i = 0; i< inputLength-pwLength; i ++ ) {
			
			remove(i);
			switch (charArray[i+pwLength]) {
			case 'A' : ok[0]++;
			if(ok[0]==check[0]) {
				pw++;
			}break;
			
			case 'C' : ok[1]++;
			if(ok[1]==check[1]) {
				pw++;
			}break;
			
			case 'G' : ok[2]++;
			if(ok[2]==check[2]) {
				pw++;
			}break;
			
			case 'T' : ok[3]++;
			if(ok[3]==check[3]) {
				pw++;
			}break;
			}
			if(pw==4) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	
	

}
