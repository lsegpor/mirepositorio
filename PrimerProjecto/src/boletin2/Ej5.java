package boletin2;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x, y, z;
		System.out.println("Introduce tres numeros largos.");
		x=sc.nextLong();
		y=sc.nextLong();
		z=sc.nextLong();
		sc.close();
		if (x>y && x>z) {
			System.out.println("El primer numero es el mayor.");
		} else {
			if (y>x && y>z) {
				System.out.println("El segundo numero es el mayor.");
			} else {
				System.out.println("El tercer numero es el mayor.");
			}
		}
	}

}
