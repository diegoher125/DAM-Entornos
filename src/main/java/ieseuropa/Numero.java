package main.java.ieseuropa;

public class Numero {
	private static int[] seriePell_15(){
		return new int[] {1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860, 33461, 80782, 195025, 470832, 1136689,
			2744210, 6625109, 15994428};
	}
	public static void main(String[] args) {
		int[] pell = seriePell_15();
		for (int num : pell) {
			System.out.println(num);
		}
	}

}
