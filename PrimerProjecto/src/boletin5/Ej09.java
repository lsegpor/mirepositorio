package boletin5;

import java.util.Scanner;

public class Ej09 {
	
	public static void divisoresPrimos(int numero) {
		int div=0;
		for (int i=numero; i>=1; i--) {
			if (numero%i==0) {
				for (int j=1; j<=i; j++) {
					if (i%j==0) {
						div++;
					}
				}
				if (div==2) {
					System.out.println(i);
				}
				div=0;
			}
		}
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num;
			System.out.println("Introduce un numero.");
			num=sc.nextInt();
			divisoresPrimos(num);
		}
	}
}