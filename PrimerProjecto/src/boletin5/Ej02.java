package boletin5;

public class Ej02 {
	
	public static void entre(int min, int max) {
		int i;
		
		for (i=min+1; i<max; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int num1=6, num2=20;
		
		entre(num1, num2);
	}
}