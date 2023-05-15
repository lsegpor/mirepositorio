package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Diseñar un programa que solicite al usuario 5 números decimales. A
continuación, debe mostrar los números en el mismo orden en que se han introducido.*/

public class Ej01 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			float numero[]=new float [5];
			for (int i=0; i<numero.length; i++) {
				System.out.println("Introduce un numero.");
				numero[i]=sc.nextFloat();
			}
			System.out.println(Arrays.toString(numero));
		}
	}
}