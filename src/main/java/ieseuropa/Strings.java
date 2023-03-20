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
	public static void main(String[] args) {
		
		String string = "La gran casa azul";
		System.out.println(ocurrenciasLetra(string, 'a'));
	}

}
