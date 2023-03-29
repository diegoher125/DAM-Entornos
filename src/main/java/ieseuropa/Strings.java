package main.java.ieseuropa;

public class Strings {
	private static int ocurrenciasLetra(String string, char letra) {
		int contador = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == letra) {
				contador++;
			}
		}
		
		return contador;
	}
	private static String todoMinus(String string) {
		return string.toLowerCase();
	}
	private static String todoMayus(String string) {
		return string.toUpperCase();
	}
	private static String borrarPrimeroDeSegundo(String string, String string2) {
		return string.replace(string2, "");
	}
	
	public static void repetirLetra(String palabra) {
		for(int i = 0; i < palabra.length(); i++) {
			System.out.print(palabra.charAt(i));
			System.out.print(palabra.charAt(i));
		}
		System.out.println();
	}
	

	public static int longitudNombre(String nombre) {
		return nombre.length();
	}
	

	public static void main(String[] args) {
		
		String string = "La gran casa azul";
		String string2 = "casa";
		System.out.println(ocurrenciasLetra(string, 'a'));
		System.out.println(todoMinus(string));
		System.out.println(todoMayus(string));
		System.out.println(borrarPrimeroDeSegundo(string, string2));


		System.out.println("---------------------------- Duplicar Letra");
		repetirLetra("NBA");
		repetirLetra("Madrid");

		
		System.out.println("---------------------------- Longitud de un nombre");
		System.out.println(longitudNombre("Javier"));
		System.out.println(longitudNombre("Santiago")); 

	}
	
	
	

}
