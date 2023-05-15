package boletin4;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		num1=(int)(Math.random()*101);
		System.out.println("Adivina un numero entre 0 y 100.");
		num2=sc.nextInt();
		while (num2!=num1 && num2!=-1) {
			if (num2>num1) {
				System.out.println("Incorrecto. El numero a adivinar es menor. Vuelve a intentarlo.");
				num2=sc.nextInt();
			} else {
				System.out.println("Incorrecto. El numero a adivinar es mayor. Vuelve a intentarlo.");
				num2=sc.nextInt();
			}
		}
		if (num2==-1) {
			System.out.println("El numero a adivinar era "+num1+".");
		} else {
			System.out.println("Correcto!");
		}
		sc.close();
	}

}