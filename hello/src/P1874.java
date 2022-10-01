import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class P1874{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sf=new StringBuffer();
		Stack<Integer> check = new Stack<>();
		Queue<Integer> input = new LinkedList<>();
		int inputLength = sc.nextInt();
		for(int i = 0 ; i < inputLength ; i++) {
			input.offer(sc.nextInt());
			
		}
		
		for(int j = 1;j<=inputLength;j++) {
		check.push(j);
		
			sf.append("+\n");

		while(check.peek().equals(input.peek())) {
				check.pop();
				input.poll();
				sf.append("-\n");
				if(check.isEmpty()) {
					break;
				}
			}
		}
		if((input.peek()!=null)&&(check.peek()!=null)) {
			if(input.peek()<check.peek()){
				System.out.println("NO");
			}
		}
		else {
			System.out.println(sf.toString());
		}
		
	}
}