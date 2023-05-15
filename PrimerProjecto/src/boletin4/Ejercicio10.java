package boletin4;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num, i;
		System.out.println("Introduce un numero entre el 1 y el 10.");
		num=sc.nextInt();
		while (num<1 || num>10) {
			System.out.println("El numero introducido no esta dentro del rango establecido. Introduce un numero valido.");
			num=sc.nextInt();
			sc.close();
		}
		for (i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
}