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
	public static void main(String[] args) {
		
		String string = "La gran casa azul";
		System.out.println(ocurrenciasLetra(string, 'a'));
		System.out.println(todoMinus(string));
		System.out.println(todoMayus(string));
	}

}
