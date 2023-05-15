package boletin4;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num, fact, i;
		System.out.println("Introduce un numero.");
		num=sc.nextDouble();
		sc.close();
		fact=1;
		for (i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("El factorial de "+num+" es "+fact+".");
	}
}