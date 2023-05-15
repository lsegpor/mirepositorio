package boletin1;
import java.util.Scanner;

public class SextaClase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1, num2, num3, num4;
		int media;
		System.out.println("Introduce cuatro notas decimales.");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		num3=sc.nextFloat();
		num4=sc.nextFloat();
		sc.close();
		media=(int)(num1+num2+num3+num4)/4;
		System.out.println("La media aritmetica es "+media+".");
	}

}
