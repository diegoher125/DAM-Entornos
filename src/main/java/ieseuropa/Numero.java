package main.java.ieseuropa;

public class Numero {

	public static boolean numeroSuerte(String fechaNacimiento, int valorEsperado) {
		int resultado = 0;
		String[] fechaSplit = fechaNacimiento.split("/");
		int dia = Integer.valueOf(fechaSplit[0]);
		int mes = Integer.valueOf(fechaSplit[1]);
		int anno = Integer.valueOf(fechaSplit[2]);
		resultado = dia + mes + anno;
		do {
			resultado = resultado / 10 + resultado % 10;
		} while (resultado > 10);
		
		if(resultado == valorEsperado) {
			return true;
		}else {
			return false;
		}
	}
	
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
	private static int[] seriePell_15(){
		return new int[] {1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860, 33461, 80782, 195025, 470832, 1136689,
			2744210, 6625109, 15994428};
	}
	private static void pasarHMS(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------------------------------------- Armstrong");
		System.out.println(esNumeroArmstrong(153));
		System.out.println(esNumeroArmstrong(125));
    System.out.println("--------------------------------------- Número de la suerte");
		System.out.println(numeroSuerte("12/07/1980",111));
		System.out.println(numeroSuerte("4/10/1993", 9));
		System.out.println("--------------------------------------- Primo");
		System.out.println(esPrimo(5));
		System.out.println(esPrimo(4));
		System.out.println("--------------------------------------- Factorial");
		System.out.println("Factorial de 9: "+ calcularFactorial(9));
		System.out.println("--------------------------------------- Pell");
		int[] pell = seriePell_15();
		for (int num : pell) {
			System.out.print(num+" ");
		}
		System.out.println("\n--------------------------------------- Segundos");
		pasarHMS(23564);

	}

}
