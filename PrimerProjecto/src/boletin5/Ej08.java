package boletin5;

import java.util.Scanner;

public class Ej08 {
	
	public static int primos(int numero) {
		int i, j, div=0, primoDiv=0;
		for (i=numero; i>=1; i--) {
			if (numero%i==0) {
				for (j=1; j<=i; j++) {
					if (i%j==0) {
						div++;
					}
				}
				if (div==2) {
					primoDiv++;
				}
				div=0;
			}
		}
		return primoDiv;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num;
			System.out.println("Introduce un numero.");
			num=sc.nextInt();
			System.out.println("El numero introducido tiene "+primos(num)+" divisores primos.");
		}
	}
}