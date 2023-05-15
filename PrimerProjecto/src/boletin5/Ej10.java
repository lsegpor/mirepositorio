package boletin5;

import java.util.Scanner;

public class Ej10 {
	
	public static int sumaDiv(int numero) {
		int suma=0;
		for (int i=(numero-1); i>=1; i--) {
			if (numero%i==0) {
				suma=suma+i;
			}
		}
		return suma;
	}
	
	public static boolean amigos(int numero1, int numero2) {
		return sumaDiv(numero1)==numero2 && sumaDiv(numero2)==numero1;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num1, num2;
			System.out.println("Introduce un numero.");
			num1=sc.nextInt();
			System.out.println("Introduce otro numero.");
			num2=sc.nextInt();
			System.out.println("Los numeros introducidos son amigos: "+amigos(num1, num2)+".");
		}
	}
}