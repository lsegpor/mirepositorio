package boletin3;
import java.util.Scanner;

public class ec11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia, mes, año;
		System.out.println("Introduce una fecha en numeros.");
		dia=sc.nextInt();
		mes=sc.nextInt();
		año=sc.nextInt();
		sc.close();
		if (año>0 && mes>0 && mes<=12 && dia>0 && dia<=30) {
			if (dia<30) {
				dia=dia+1;
				System.out.println("El dia siguiente es "+dia+" del "+mes+" del "+año+".");
			} else {
				if (mes<12) {
					dia=1;
					mes=mes+1;
					System.out.println("El dia siguiente es "+dia+" del "+mes+" del "+año+".");
				} else {
					dia=1;
					mes=1;
					año=año+1;
					System.out.println("El dia siguiente es "+dia+" del "+mes+" del "+año+".");
				}
			}
		} else {
			System.out.println("La fecha es invalida.");
		}
	}

}