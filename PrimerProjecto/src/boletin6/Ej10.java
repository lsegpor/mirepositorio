package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Escribir la función rellenaPares() a la que se le pasa como parámetro
una tabla unidimensional que debe rellenar de la siguiente forma: se leerá por
teclado una serie de números, guardando en la tabla los pares hasta que esté llena,
e ignorando los impares. La función tiene que devolver la cantidad de impares
desechados.*/

public class Ej10 {
	
	public static int rellenaPares(int t[]) {
		try (Scanner sc=new Scanner(System.in)) {
			int impares=0, i=0, num;
			System.out.println("Introduce los valores de la tabla.");
			while (i<t.length) {
				num=sc.nextInt();
				if (num%2==0) {
					t[i]=num;
					i++;
				} else {
					impares++;
				}
			}
			return impares;
		}
	}

	public static void main(String[] args) {
		int tabla[]=new int [6];
		System.out.println("Se han desechado "+rellenaPares(tabla)+" numeros impares.");
		System.out.println(Arrays.toString(tabla));
	}
}