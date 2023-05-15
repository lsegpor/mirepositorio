package boletin2;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Introduce un numero.");
		x=sc.nextInt();
		sc.close();
		if (x%2==0) {
			System.out.println("El numero es par.");
		} else {
			System.out.println("El numero es impar.");
		}
	}

}
