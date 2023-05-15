package boletin3;
import java.util.Scanner;

public class ec02B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, par;
		System.out.println("Introduce un numero.");
		x=sc.nextInt();
		sc.close();
		par=(x%2==0)?1:0;
		System.out.println(par);
	}

}
