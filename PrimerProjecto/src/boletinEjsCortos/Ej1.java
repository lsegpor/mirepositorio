package boletinEjsCortos;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float nota1, nota2, nota3, media, sus, mediaMayor, sob, a, b, c, d;
		char grupo;
		String nom, nomFinal;
		nomFinal=null;
		sus=0;
		mediaMayor=-1;
		sob=0;
		System.out.println("Introduce el grupo del que quieres clasificar las notas.");
		grupo=sc.next().charAt(0);
		switch (grupo) {
		case 'A':
			for (a=1; a<=25; a++) {
				System.out.println("Introduce el nombre del alumno "+a+".");
				nom=sc.next();
				System.out.println("Introduce la nota del primer parcial.");
				nota1=sc.nextInt();
				System.out.println("Introduce la nota del segundo parcial.");
				nota2=sc.nextInt();
				System.out.println("Introduce la nota del tercer parcial.");
				nota3=sc.nextInt();
				media=(nota1+nota2+nota3)/3;
				if (media<5) {
					sus++;
				}else if (media>=9) {
					sob++;
				}
				if (media>mediaMayor) {
					mediaMayor=media;
					nomFinal=nom;
				}
			}
			System.out.println("El alumno con mayor media de parciales ha sido "+nomFinal+".");
			System.out.println("Hay "+sus+" alumnos con la media suspensa.");
			if (sob!=0) {
				System.out.println("Existen sobresalientes.");
			}
			break;
		case 'B':
			for (b=1; b<=28; b++) {
				System.out.println("Introduce el nombre del alumno "+b+".");
				nom=sc.next();
				System.out.println("Introduce la nota del primer parcial.");
				nota1=sc.nextInt();
				System.out.println("Introduce la nota del segundo parcial.");
				nota2=sc.nextInt();
				System.out.println("Introduce la nota del tercer parcial.");
				nota3=sc.nextInt();
				media=(nota1+nota2+nota3)/3;
				if (media<5) {
					sus++;
				}
				if (media>=9) {
					sob++;
				}
				if (media>mediaMayor) {
					media=mediaMayor;
					nom=nomFinal;
				}
			}
			System.out.println("El alumno con mayor media de parciales ha sido "+nomFinal+".");
			System.out.println("Hay "+sus+" alumnos con la media suspensa.");
			if (sob!=0) {
				System.out.println("Existen sobresalientes.");
			}
			break;
		case 'C':
			for (c=1; c<=31; c++) {
				System.out.println("Introduce el nombre del alumno "+c+".");
				nom=sc.next();
				System.out.println("Introduce la nota del primer parcial.");
				nota1=sc.nextInt();
				System.out.println("Introduce la nota del segundo parcial.");
				nota2=sc.nextInt();
				System.out.println("Introduce la nota del tercer parcial.");
				nota3=sc.nextInt();
				media=(nota1+nota2+nota3)/3;
				if (media<5) {
					sus++;
				}
				if (media>=9) {
					sob++;
				}
				if (media>mediaMayor) {
					media=mediaMayor;
					nom=nomFinal;
				}
			}
			System.out.println("El alumno con mayor media de parciales ha sido "+nomFinal+".");
			System.out.println("Hay "+sus+" alumnos con la media suspensa.");
			if (sob!=0) {
				System.out.println("Existen sobresalientes.");
			}
			break;
		case 'D':
			for (d=1; d<=29; d++) {
				System.out.println("Introduce el nombre del alumno "+d+".");
				nom=sc.next();
				System.out.println("Introduce la nota del primer parcial.");
				nota1=sc.nextInt();
				System.out.println("Introduce la nota del segundo parcial.");
				nota2=sc.nextInt();
				System.out.println("Introduce la nota del tercer parcial.");
				nota3=sc.nextInt();
				sc.close();
				media=(nota1+nota2+nota3)/3;
				if (media<5) {
					sus++;
				}
				if (media>=9) {
					sob++;
				}
				if (media>mediaMayor) {
					media=mediaMayor;
					nom=nomFinal;
				}
			}
			System.out.println("El alumno con mayor media de parciales ha sido "+nomFinal+".");
			System.out.println("Hay "+sus+" alumnos con la media suspensa.");
			if (sob!=0) {
				System.out.println("Existen sobresalientes.");
			}
			break;
		default:
			System.out.println("La letra introducida no corresponde a ningun grupo.");
		}
	}
}
