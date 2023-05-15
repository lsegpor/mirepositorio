package boletin2;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double g=9.8;
		double t, v;
		System.out.println("Introduce una cantidad de tiempo en segundos.");
		t=sc.nextDouble();
		sc.close();
		v=t*g;
		if (t>=0) {
			System.out.println("La velocidad es de "+v+" m/s.");
		} else {
			System.out.println("Tiempo incorrecto.");
		}
	}

}
