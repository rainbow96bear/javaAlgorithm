import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int n;
		boolean a;
		do {
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
		}while(!((n<100)&&(n>1)));
		Scanner sc = new Scanner(System.in);
		char[] array = new char[3];
		do {
		String inputNum = sc.next();
		
		array=inputNum.toCharArray();
		}while(array.length!=n);
		System.out.println(array);
		
		int sum=0;
	
		for(int i=0;i<n;i++) {
			sum += array[i]-'0';
		}
		System.out.println(sum);
		
	}

}
