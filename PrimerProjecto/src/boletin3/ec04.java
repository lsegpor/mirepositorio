package boletin3;
import java.util.Scanner;

public class ec04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double pi=3.14;
		int radio, x, diametro, perimetro, area;
		System.out.println("Introduce un valor de radio.");
		radio=sc.nextInt();
		System.out.println("Introduce 1 para calcular el diametro, 2 para calcular el perimetro y 3 para calcular el area.");
		x=sc.nextInt();
		sc.close();
		diametro=(2*radio);
		perimetro=(int)(2*pi*radio);
		area=(int)(pi*radio*radio);
		switch (x) {
		case 1:
			System.out.println("El diametro es "+diametro);
			break;
		case 2:
			System.out.println("El perimetro es "+perimetro);
			break;
		case 3:
			System.out.println("El area es "+area);
			break;
		default:
			System.out.println("Valor no ejecutable.");
			break;
		}
	}
}