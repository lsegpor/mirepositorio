package boletin1;
import java.util.Scanner;

public class QuintaClase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float c, f;
		System.out.println("Introduce una temperatura en grados centigrados.");
		c=sc.nextFloat();
		sc.close();
		f=9*c/5+32;
		System.out.println(c+" grados centigrados son "+f+" grados fahrenheit.");
	}

}
