package main.java.ieseuropa;

public class Numero {
	private static int calcularFactorial(int numero) {
		int factorial = 1;
		for (int i = numero; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
	public static void main(String[] args) {
		System.out.println(calcularFactorial(9));
	}

}
