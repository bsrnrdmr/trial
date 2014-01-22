public class MathFunctionsMain {

	public static void main(String[] args) {
		MathFunctions m1 = new MathFunctions();
		MathFunctions m2 = new MathFunctions();
		
		System.out.println("exp(1) = " + MathFunctions.exp(1));
		System.out.println("sin(pi/2) = " + MathFunctions.sin(3.141592654/2));
		
		System.out.println("Generate 10 random values through m1:");
		for (int i=0; i<10; i++)
			System.out.print(m1.random()+";  ");
		System.out.println();

		System.out.println("Now, generate 10 random values through m2:");
		for (int i=0; i<10; i++)
			System.out.print(m2.random()+";  ");
		System.out.println();
	}
}
