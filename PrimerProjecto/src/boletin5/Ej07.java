package boletin5;

import java.util.Scanner;

public class Ej07 {
	
	public static boolean primo(int numero) {
		int i, primoN=0;
		boolean primoSi=false;
		for (i=numero; i>0; i--) {
				if (numero%i==0) {
					primoN++;
				}
		}
		if (primoN==2) {
			primoSi=true;
		}
		return primoSi;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num;
			System.out.println("Introduce un numero.");
			num=sc.nextInt();
			System.out.println("El numero introducido es primo: "+primo(num));
		}
	}
}