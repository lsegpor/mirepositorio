package boletin5;

public class Ej01 {
	
	public static void eco( int veces) {
		int i;
		
		for (i=1; i<=veces; i++) {
			System.out.println("Eco...");
		}
	}

	public static void main(String[] args) {
		int n=6;
		
		eco(n);
	}
}