package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los
mostrará en el orden inverso al introducido.*/

public class Ej02 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce un numero.");
			int num=sc.nextInt();
			int numeros[]=new int [num];
			for (int i=numeros.length-1; i>=0; i--) {
				System.out.println("Introduce otro numero.");
				numeros[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(numeros));
		}
	}
}