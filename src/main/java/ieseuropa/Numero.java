package main.java.ieseuropa;

public class Numero {

	public static boolean numeroSuerte(String fechaNacimiento, int valorEsperado) {
		int resultado = 0;
		String[] fechaSplit = fechaNacimiento.split("/");
		int dia = Integer.valueOf(fechaSplit[0]);
		int mes = Integer.valueOf(fechaSplit[1]);
		int anno = Integer.valueOf(fechaSplit[2]);
		resultado = dia + mes + anno;
		do {
			resultado = resultado / 10 + resultado % 10;
		} while (resultado > 10);
		
		if(resultado == valorEsperado) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------------------------- Número de la suerte");
		System.out.println(numeroSuerte("12/07/1980",111));
		System.out.println(numeroSuerte("4/10/1993", 9));
		
		
	}

}
