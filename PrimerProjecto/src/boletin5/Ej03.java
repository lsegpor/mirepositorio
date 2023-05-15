package boletin5;
import java.util.Scanner;

public class Ej03 {
	
	public static void volumen(int radio, int altura) {
		double volumen, pi=Math.PI;
		volumen=pi*radio*radio*altura;
		System.out.println("El volumen del cilindro es "+volumen+".");
	}

	public static void area(int radio, int altura) {
		double area, pi=Math.PI;
		
		area=2*pi*radio*(altura+radio);
		System.out.println("El area del cilindro es "+area+".");
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num, radio, altura;
			
			System.out.println("Introduce el radio del cilindro.");
			radio=sc.nextInt();
			System.out.println("Introduce la altura del cilindro.");
			altura=sc.nextInt();
			System.out.println("Introduce 1 para saber el area del cilindro y 2 para saber su volumen.");
			num=sc.nextInt();
			if (num==1) {
				area(radio, altura);
			} else if (num==2) {
				volumen(radio, altura);
			} else {
				System.out.println("El numero introducido no corresponde a ningun valor.");
			}
		}
	}
}