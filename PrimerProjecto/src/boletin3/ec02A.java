package boletin3;
import java.util.Scanner;

public class ec02A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, par;
		System.out.println("Introduce un numero.");
		x=sc.nextInt();
		sc.close();
		if (x%2==0) {
			par=1;
		} else {
			par=0;
		}
		System.out.println(par);
	}

}
