package boletin3;
import java.util.Scanner;

public class ec05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroDni, codigoLetra;
		System.out.println("Introduce tu numero de dni sin la letra.");
		numeroDni=sc.nextInt();
		sc.close();
		codigoLetra=numeroDni%23;
		switch (codigoLetra) {
		case 0:
			System.out.println("Tu letra es T.");
			break;
		case 1:
			System.out.println("Tu letra es R.");
			break;
		case 2:
			System.out.println("Tu letra es W.");
			break;
		case 3:
			System.out.println("Tu letra es A.");
			break;
		case 4:
			System.out.println("Tu letra es G.");
			break;
		case 5:
			System.out.println("Tu letra es M.");
			break;
		case 6:
			System.out.println("Tu letra es Y.");
			break;
		case 7:
			System.out.println("Tu letra es F.");
			break;
		case 8:
			System.out.println("Tu letra es P.");
			break;
		case 9:
			System.out.println("Tu letra es D.");
			break;
		case 10:
			System.out.println("Tu letra es X.");
			break;
		case 11:
			System.out.println("Tu letra es B.");
			break;
		case 12:
			System.out.println("Tu letra es N.");
			break;
		case 13:
			System.out.println("Tu letra es J.");
			break;
		case 14:
			System.out.println("Tu letra es Z.");
			break;
		case 15:
			System.out.println("Tu letra es S.");
			break;
		case 16:
			System.out.println("Tu letra es Q.");
			break;
		case 17:
			System.out.println("Tu letra es V.");
			break;
		case 18:
			System.out.println("Tu letra es H.");
			break;
		case 19:
			System.out.println("Tu letra es L.");
			break;
		case 20:
			System.out.println("Tu letra es C.");
			break;
		case 21:
			System.out.println("Tu letra es K.");
			break;
		default:
			System.out.println("Tu letra es E.");
			break;
		}
	}

}
