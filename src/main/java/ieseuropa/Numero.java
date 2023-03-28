package main.java.ieseuropa;

public class Numero {
	
	private static void pasarHMS(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);
	}
	public static void main(String[] args) {
		pasarHMS(23564);
	}

}
