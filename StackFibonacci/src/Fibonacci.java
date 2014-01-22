import java.util.Stack;


public class Fibonacci {
	public static void main(String [] args){
	System.out.println(Fibo(6));	
	}
	 public static int Fibo(int n){
		Stack <Integer>stack = new Stack<Integer>();
		int total = 0;
		int zero = 1;
		int one = 1;
		int k =1;
		
		stack.push(zero);
		stack.push(one);
		while(k!=n){
			int a =  stack.pop();
			int b =  stack.pop();
			total = a+b;
			stack.push(b);
			stack.push(a);
			stack.push(total);
			k++;
		}
		return total;
		
		
		
		
	 }
	
	
	
}
