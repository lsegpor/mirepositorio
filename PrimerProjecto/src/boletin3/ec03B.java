package boletin3;
import java.util.Scanner;

public class ec03B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte x, y, menor;
		System.out.println("Introduce un numero.");
		x=sc.nextByte();
		System.out.println("Introduce otro numero.");
		y=sc.nextByte();
		sc.close();
		menor=(x<y)?x:y;
		System.out.println("El menor de los numeros es "+menor);
	}
	

}
