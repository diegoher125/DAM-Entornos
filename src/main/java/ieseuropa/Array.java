package main.java.ieseuropa;

public class Array {
	private static float mediana (int[] array) {
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
		int [] array ={3,16,25,40};
		System.out.println("La mediana es: "+mediana(array));
	}

}
