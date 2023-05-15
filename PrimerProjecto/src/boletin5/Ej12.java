package boletin5;
import java.util.Scanner;

public class Ej12 {
	
	public static int factorial(int n) {
		int resultado;
		if (n==0) {
			resultado=1;
		} else {
			resultado=n*factorial(n-1);
		}
		return resultado;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce un numero.");
			int num=sc.nextInt();
			System.out.println("El factorial de "+num+" es "+factorial(num)+".");
		}
	}
}