package boletin4;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float nota, i, sus;
		sus=0;
		for (i=1; i<=5; i++) {
			System.out.println("Introduce la nota "+i+".");
			nota=sc.nextFloat();
			sc.close();
			if (nota<5) {
				sus++;
			}
		}
		System.out.println("Hay "+sus+" suspensos.");
	}

}