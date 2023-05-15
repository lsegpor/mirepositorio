package boletin4;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nota, aprob, sus, cond, i;
		aprob=0;
		sus=0;
		cond=0;
		for (i=1; i<=6; i++) {
			System.out.println("Introduce la nota "+i+".");
			nota=sc.nextInt();
			sc.close();
			if (nota<=5) {
				if (nota==4) {
					cond++;
				} else {
					sus++;
				}
			} else {
				aprob++;
			}
		}
		System.out.println("Hay "+aprob+" aprobado(s), "+cond+" condicionado(s) y "+sus+" suspenso(s).");
	}
}