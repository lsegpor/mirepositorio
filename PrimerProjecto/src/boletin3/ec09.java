package boletin3;
import java.util.Scanner;

public class ec09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num;
		System.out.println("Introduce un numero entre 0 y 9999.");
		num=sc.nextLong();
		sc.close();
		if (num>=0 && num<=9) {
			System.out.println("El numero tiene una cifra.");
		} else {
			if (num>=10 && num<=99) {
				System.out.println("El numero tiene dos cifras.");
			} else {
				if (num>=100 && num<=999) {
					System.out.println("El numero tiene tres cifras.");
				} else {
					if (num>=1000 && num<=9999) {
						System.out.println("El numero tiene cuatro cifras.");
					} else {
						System.out.println("El numero no esta dentro del intervalo solicitado.");
					}
				}
			}
		}
	}

}
