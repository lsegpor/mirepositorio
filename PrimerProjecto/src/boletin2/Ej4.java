package boletin2;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, y;
		System.out.println("Introduce un numero.");
		x=sc.nextInt();
		System.out.println("Introduce otro numero.");
		y=sc.nextInt();
		sc.close();
		if (x>0 && y>0) {
			System.out.println("Ambos numeros son positivos.");
		} else {
			if (x<0 && y<0) {
				System.out.println("Ningun numero es positivo.");
			} else {
				System.out.println("Uno de los numeros es positivo.");
			}
		}
	}

}
