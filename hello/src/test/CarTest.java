package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class CarTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for
		hanoi(1,N,3);
		
	}
	static void hanoi(int m, int n, int o) {//1�� ����� m���� o�� �������
		if(n<=0) {return ;}
		int k = 6-(m+o);
		hanoi(m,n-1,k);
		System.out.println("����["+n+"]�� "+m+"���� "+o+"������� �ű�");
		hanoi(k,n-1,o);
	}
}