package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	private static float mediana (int[] array) {
		Arrays.sort(array);
		int size = array.length;
		float mediana = 0;
		if(size%2!=0) {
			mediana=array[(size-1)/2];
		}
		else {
			int posicion=(size/2);
			mediana=(float)(array[posicion-1]+array[posicion])/2;
		}
		return mediana;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int [] array ={3,40,25,16};
		System.out.println("La mediana es: "+mediana(array));
		CalcularMaximo smax = new CalcularMaximo();
		System.out.println(smax.calcularMax(array));
		CalcularMinimo smin = new CalcularMinimo();
		System.out.println(smin.calcularMin(array));
	}

}
