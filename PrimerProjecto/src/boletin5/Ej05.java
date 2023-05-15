package boletin5;
import java.util.Scanner;

public class Ej05 {
	
	public static int mayor(int x, int y) {
		int res;
		if (x>y) {
			res=x;
		} else {
			res=y;
		}
		return res;
	}
	
	public static int mayor(int x, int y, int z) {
		return mayor(mayor(x, y), z);
	}

	public static void main(String[] args) {
		int num1, num2, num3;
		
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce el primer numero a comparar.");
			num1=sc.nextInt();
			System.out.println("Introduce el segundo numero a comparar.");
			num2=sc.nextInt();
			System.out.println("Introduce el tercer numero a comparar.");
			num3=sc.nextInt();
			System.out.println("El mayor de los tres numeros es "+mayor(num1,num2,num3)+".");
			
		}
	}
}