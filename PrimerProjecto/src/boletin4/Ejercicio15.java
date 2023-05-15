package boletin4;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		try(Scanner sc1 = new Scanner(System.in);){
			int n, i, j, primo, primoN;
			primo=0;
			primoN=0;
			System.out.println("Introduce un numero.");
			n=sc1.nextInt();
			for (i=1; i<=n; i++) {
				for (j=2; j<i; j++) {
					if (i%j==0) {
						primoN++;
					}
				}
				if (primoN == 0) {
					primo++;
				}
				primoN = 0;
			}
			System.out.println("Entre 1 y "+n+" hay "+primo+" numero(s) primo(s).");
		}

	}

}
