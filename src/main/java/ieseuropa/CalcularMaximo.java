package main.java.ieseuropa;

public class CalcularMaximo {
	
	public static int calcularMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int num:array) {
			if(num > max)
				max = num;
		}
		return max;
	}

}
