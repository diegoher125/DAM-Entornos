package main.java.ieseuropa;

public class Numero {

	public static boolean esPrimo(int dato) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != dato)) {
			if (dato % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
	private static int calcularFactorial(int numero) {
		int factorial = 1;
		for (int i = numero; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("--------------------------------------- Primo");
		System.out.println(esPrimo(5));
		System.out.println(esPrimo(4));
		System.out.println("--------------------------------------- Factorial");
		System.out.println("Factorial de 9: "+ calcularFactorial(9));

	}

}
