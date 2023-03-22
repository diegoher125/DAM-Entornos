package main.java.ieseuropa;

import java.lang.reflect.Array;

public class CalcularMaximo {
	
	private static int saberMaximo() { 
		int[] array = { 10, 33, 81, 53, 22 };
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("El máximo es " + saberMaximo());
	}

}
