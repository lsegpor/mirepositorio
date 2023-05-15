package boletin4;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cm;
		int num, mayor;
		num=0;
		mayor=0;
		cm=0;
		while (cm!=-1) {
			System.out.println("Introduce la altura del arbol "+num+".");
			cm=sc.nextFloat();
			if (cm<-1) {
				System.out.println("La altura no puede ser negativa. Introduce una altura valida.");
				cm=sc.nextFloat();
				num++;
			} else {
				if (cm>mayor) {
					mayor=num;
					num++;
				}
			}
		}
		System.out.println("El arbol mas alto es el numero "+mayor+".");	
		sc.close();
	}
}