package main.java.ieseuropa;

public class Numero {

	
	public static boolean esNumeroArmstrong(int numero) {
		int suma = 0;
		int original = numero;
		int longitud = String.valueOf(numero).length();

		while (numero > 0) {
			int digito = numero % 10;
			suma += Math.pow(digito, longitud);
			numero /= 10;
		}
		boolean respuesta = false;
		if (suma == original) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------------------------------------- Armstrong");
		System.out.println(esNumeroArmstrong(153));
		System.out.println(esNumeroArmstrong(125));
		
		
	}

}
