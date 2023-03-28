package main.java.ieseuropa;

import java.util.Scanner;

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
	
	public static void repetirStrings(String str1, String str2) {
		Scanner teclado = new Scanner(System.in);
		String resultado = "";
		int veces = teclado.nextInt();
		for(int i = 0; i < veces; i++) {
			System.out.println(str1 + " " + str2);
		}
	}
	
	public static void main(String[] args) {
		
		String string = "La gran casa azul";
		String string2 = "casa";
		System.out.println(ocurrenciasLetra(string, 'a'));
		System.out.println(todoMinus(string));
		System.out.println(todoMayus(string));
		System.out.println(borrarPrimeroDeSegundo(string, string2));
		
		System.out.println("---------------------------- Repetir Strings");
		repetirStrings("Joaquin", "Acosta");
		
		
	}

}
