package boletin1;
import java.util.Scanner;

public class SeptimaClase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float base, altura, area;
		System.out.println("Introduce una base.");
		base=sc.nextFloat();
		System.out.println("Introduce una altura");
		altura=sc.nextFloat();
		sc.close();
		area=base*altura/2;
		System.out.println("El area es "+area+".");
	}

}
