package boletin5;
import java.util.Scanner;

public class Ej04 {
	
	public static void parametros(int min, int max) {
		if (max>min) {
			System.out.println("El mayor de los dos numeros es "+max+".");
		} else {
			System.out.println("El mayor de los dos numeros es "+min+".");
		}
	}


	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num1, num2;
			
			System.out.println("Introduce un numero entero.");
			num1=sc.nextInt();
			System.out.println("Introduce otro numero entero.");
			num2=sc.nextInt();
			parametros(num1, num2);
		}
	}
}