package boletin1;
import java.util.Scanner;

public class CuartaClase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float x, m;
		System.out.println("Introduce una longitud en millas.");
		x=sc.nextFloat();
		sc.close();
		m=x*1609;
		System.out.println(x+" millas son "+m+" metros.");
	}

}
