package boletin3;
import java.util.Scanner;

public class ec03A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte x, y, menor;
		System.out.println("Introduce un numero.");
		x=sc.nextByte();
		System.out.println("Introduce otro numero.");
		y=sc.nextByte();
		sc.close();
		if (x>y) {
			menor=y;
			System.out.println("El menor de los numeros es "+menor);
		} else {
			menor=x;
			System.out.println("El menor de los numeros es "+menor);
		}
	}

}
