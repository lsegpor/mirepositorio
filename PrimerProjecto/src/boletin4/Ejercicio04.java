package boletin4;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, n0;
		n0=0;
		System.out.println("Introduce un numero.");
		n=sc.nextInt();
		do {
			n0=n0+1;
			System.out.println(n0);
		} while (n0<n);
		sc.close();
	}
}