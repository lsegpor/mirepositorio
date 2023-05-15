package boletin4;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min, max, valor;
		System.out.println("Introduce un valor minimo para el rango.");
		min=sc.nextInt();
		System.out.println("Introduce un valor maximo para el rango.");
		max=sc.nextInt();
		System.out.println("Ahora introduce un valor que este dentro de ese rango.");
		valor=sc.nextInt();
		while (valor<min || valor>max) {
			System.out.println("El valor esta fuera del rango. Vuelve a intentarlo.");
			valor=sc.nextInt();
		}
		System.out.println("Correcto, el valor esta dentro del rango.");
		sc.close();
	}
}