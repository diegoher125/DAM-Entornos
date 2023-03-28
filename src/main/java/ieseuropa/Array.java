package main.java.ieseuropa;

public class Array {
	
	private static int saberMaximo(int[] array) { 
		
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[] array = { 10, 33, 81, 53, 22 };
		System.out.println("El maximo es: " + saberMaximo(array));
	}

}
