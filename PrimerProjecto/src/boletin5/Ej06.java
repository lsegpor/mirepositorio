package boletin5;

import java.util.Scanner;

public class Ej06 {
	
	public static boolean vocal(char letra) {
		boolean vocalSi=false;
		if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
			vocalSi=true;
		}
		return vocalSi;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			char caracter;
			System.out.println("Introduce una letra.");
			caracter=sc.next().charAt(0);
			System.out.println("La letra introducida es una vocal: "+vocal(caracter));
		}
	}
}