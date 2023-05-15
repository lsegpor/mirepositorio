package boletin4;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float edad, edadFinal, media, num, mayoresEdad;
		System.out.println("Introduce la edad de un alumno.");
		edad=sc.nextFloat();
		num=0;
		mayoresEdad=0;
		media=0;
		edadFinal=0;
		while (edad>=0) {
			edadFinal=edadFinal+edad;
			num=num+1;
			media=edadFinal/num;
			if (edad>=18) {
				mayoresEdad=mayoresEdad+1;
			}
			System.out.println("Introduce otra edad de otro alumno.");
			edad=sc.nextInt();
		}
		System.out.println("La edad introducida es invalida.");
		System.out.println("La suma de las edades es "+edadFinal+", su media es "+media+", se han introducido "+num+" edades y hay "+mayoresEdad+" mayores de edad.");
		sc.close();
	}
}