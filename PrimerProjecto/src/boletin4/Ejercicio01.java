package boletin4;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Introduce un numero.");
		x=sc.nextInt();
		while (x!=0) {
			if (x%2==0) {
				System.out.println("El numero es par.");
			} else {
				System.out.println("El numero no es par.");
			}
			if (x>0) {
				System.out.println("El numero es positivo.");
			} else {
				System.out.println("El numero no es positivo.");
			}
			System.out.println("El cuadrado de "+x+" es "+(x*x)+".");
			System.out.println("Introduce otro numero.");
			x=sc.nextInt();
		}
		System.out.println("El numero introducido es 0.");
		sc.close();
	}

}