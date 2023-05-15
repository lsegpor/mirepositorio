package boletin3;
import java.util.Scanner;

public class ec07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double xCuadrado, x, num, sol1, sol2, raiz;
		System.out.println("Introduce la cifra de x^2, x y un numero.");
		xCuadrado=sc.nextDouble();
		x=sc.nextDouble();
		num=sc.nextDouble();
		sc.close();
		raiz=Math.sqrt(x*x-4*xCuadrado*num);
		sol1=(-x+raiz)/(2*xCuadrado);
		sol2=(-x-raiz)/(2*xCuadrado);
		System.out.println("Las soluciones reales de la ecuación introducida son "+sol1+" y "+sol2);
	}

}
