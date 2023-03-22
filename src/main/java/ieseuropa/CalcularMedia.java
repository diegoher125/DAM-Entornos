package main.java.ieseuropa;

public class CalcularMedia {

	public static float calcularMedia(int[] numeros) {
		int sum = 0;
		for (int i = 0; i < numeros.length; i++) {
			sum += numeros[i];
		}
		float average = (float) sum / numeros.length;
		return average;
	}

	public static void main(String[] args) {
		int[] numeros = { 10, 5, 20, 15 };
		float media = calcularMedia(numeros);
		System.out.println("La media es: " + media); 
	}

}
