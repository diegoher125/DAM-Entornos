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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("--------------------------------------- Primo");
		System.out.println(esPrimo(5));
		System.out.println(esPrimo(4));
		
	}

}
