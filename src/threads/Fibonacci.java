package threads;

public class Fibonacci {
	static int a = 0;
	static int b = 1;
	
	public static void main(String[] args) {
		System.out.println(recursiveFibo(16));
	}
	static int recursiveFibo(int n) {
//		n--;
//		int temp = a+b;
//		if(n>0) {
//			a=b;
//			b=temp;
//			recursiveFibo(n);
//		}
//		return b;
		if(n <= 1) {
			return n;
		}else {
			return recursiveFibo(n-1)+recursiveFibo(n-2);
		}
	}
	
}
