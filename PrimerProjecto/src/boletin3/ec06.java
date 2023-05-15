package boletin3;
import java.util.Scanner;

public class ec06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int eurosPorHora1=12, eurosPorHora2=16;
		int horas, salario;
		System.out.println("Introduce el numero de horas que has trabajado esta semana.");
		horas=sc.nextInt();
		sc.close();
		if (horas<=40) {
			salario=horas*eurosPorHora1;
			System.out.println("Tu salario es de "+salario+" euros.");
		} else {
			if (horas>40) {
				salario=(horas-40)*eurosPorHora2+eurosPorHora1*40;
				System.out.println("Tu salario es de "+salario+" euros.");
			} else {
				System.out.println("Numero de horas no valido.");
			}
		}
	}

}
