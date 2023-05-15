package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainCoso2 {

	public static void main(String[] args) {
		valorEntero();
	}

	public static void valorEntero() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce un valor entero.");
			int num = sc.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
