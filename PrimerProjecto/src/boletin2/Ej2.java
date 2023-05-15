package boletin2;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Introduce el numero 12.");
		x=sc.nextInt();
		sc.close();
		if (x==12) {
			System.out.println("El valor es correcto.");
		} else {
			System.out.println("El valor es incorrecto.");
		}
	}

}
