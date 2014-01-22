
public class MathFunctions {
	private int rv = 783294;                      // What if 'rv' is static?
	static final int MAXINT=100000;
	
	private static double power(double x, int n) {
		double r=1;
		for (int i=0; i<n; i++)
			r *= x;
		return r;
	}
	
	private static int factorial(int n) {
		int r=1;
		for (int i=2; i<=n; i++)
			r*=i;
		return r;
	}
	
	public static double sin(double x) {
		double r=0;
		for (int i=0; i<=10; i++)
			r += power(-1,i)*power(x,2*i+1)/factorial(2*i+1);
		return r;
	}
	
	public static double exp(double x) {
		double r=0;
		for (int i=0; i<=10; i++)                 // Try increasing the number of iterations
			r += power(x,i)/factorial(i);
		return r;
	}
	
	public int random() {
		rv = (rv * 13) % MAXINT;
		return rv;
	}
}
