package boletin1;
import java.util.Scanner;

public class OctavaClase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int horas, minutos, segundos, horasfinales, minutosfinales, segundosfinales;
		System.out.println("Introduce un numero de horas.");
		horas=sc.nextInt();
		System.out.println("Introduce un numero de minutos.");
		minutos=sc.nextInt();
		System.out.println("Introduce un numero de segundos.");
		segundos=sc.nextInt();
		sc.close();
		segundosfinales=segundos%60;
		minutosfinales=(minutos+segundos/60)%60;
		horasfinales=horas+minutos/60;
		System.out.println(horasfinales+" horas, "+minutosfinales+" minutos y "+segundosfinales+" segundos.");
	}

}
