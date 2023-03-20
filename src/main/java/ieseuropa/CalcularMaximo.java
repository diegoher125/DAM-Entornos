package main.java.ieseuropa;

import java.lang.reflect.Array;

public class CalcularMaximo {
	
	public static int encontrarMaximo(int[] array) {
	    int maximo = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > maximo) {
	            maximo = array[i];
	        }
	    }
	    return maximo;
	}
	
	public static int[] generarNumeros() {
		int[] numeros = new int [10];
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*101);
		}
		return numeros;
	}


	public static void main(String[] args) {
		int[] numeros = generarNumeros();
		for(int i = 0;i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
		System.out.println("\nEl número máximo es: " + encontrarMaximo(numeros));

	}

}
