package boletin6;
import java.util.Scanner;

/*Definir una función que tome como parámetros dos tablas, la primera
con 6 números de una apuesta de la primitiva, y la segunda con los 6 números de la
combinación ganadora. La función devolverá el número de aciertos.*/

public class Ej09 {
	
	public static int comparacion(int t[]) {
		int aciertos=0, num=0, ganadora[]={1, 2, 3, 4, 5, 6};
		for (int celda: t) {
			if (celda==ganadora[num]) {
				aciertos++;
			}
			num++;
		}
		return aciertos;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int apuesta[]=new int [6];
			System.out.println("Introduce los numeros de la apuesta.");
			for (int i=0; i<apuesta.length; i++) {
				apuesta[i]=sc.nextInt();
			}
			System.out.println("Has tenido "+comparacion(apuesta)+" aciertos.");
		}
	}
}