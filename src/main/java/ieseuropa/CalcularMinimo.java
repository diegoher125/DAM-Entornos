package main.java.ieseuropa;

public class CalcularMinimo {
	
	public static int calcularMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int num:array) {
			if(num < min)
				min = num;
		}
		return min;
	}

}
