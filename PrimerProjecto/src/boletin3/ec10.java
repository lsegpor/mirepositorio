package boletin3;
import java.util.Scanner;

public class ec10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double dia, mes, año;
		System.out.println("Introduce una fecha en numeros.");
		dia=sc.nextDouble();
		mes=sc.nextDouble();
		año=sc.nextDouble();
		sc.close();
		if (año>=0) {
			if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
				if (dia<=31 && dia>0) {
					System.out.println("La fecha es correcta.");
				} else {
					System.out.println("La fecha es incorrecta.");
				}
			} else {
				if (mes==2) {
					if (dia<=28 && dia>0) {
						System.out.println("La fecha es correcta.");
					} else {
						System.out.println("La fecha es incorrecta.");
					}
				} else {
					if (mes<=12 && dia<=30 && dia>0) {
						System.out.println("La fecha es correcta.");
					} else {
						System.out.println("La fecha es incorrecta.");
					}
				}
			}
		} else {
			System.out.println("Fecha incorrecta.");
		}
	}

}