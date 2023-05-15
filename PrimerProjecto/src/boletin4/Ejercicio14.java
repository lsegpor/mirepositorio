package boletin4;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, i, j;
		System.out.println("Introduce un numero.");
		n=sc.nextInt();
		for (i=n; i>0; i--) {
			for (j=i; j>0; j--) {
				System.out.print("*");
			}
		System.out.println("");
		}
		sc.close();
	}
}