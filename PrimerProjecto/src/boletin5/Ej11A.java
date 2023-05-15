package boletin5;
import java.util.Scanner;

public class Ej11A {
	
	public static double elevado(double a, int n) {
		double resultado=1;
		for (int i=1; i<=n; i++) {
			resultado=resultado*a;
		}
		return resultado;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce un numero que sera la base.");
			double base=sc.nextDouble();
			System.out.println("Introduce otro numero que sera el exponente.");
			int exponente=sc.nextInt();
			if (exponente<0) {
				System.out.println("El exponente no puede ser negativo.");
			} else {
				System.out.println(base+" elevado a "+exponente+" es igual a "+elevado(base, exponente)+".");
			}
		}
	}
}