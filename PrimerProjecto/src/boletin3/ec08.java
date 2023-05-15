package boletin3;
import java.util.Scanner;

public class ec08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int preg1, preg2, preg3, preg4, preg5, nota;
		nota=0;
		System.out.println("Primera pregunta: Cual es el nombre de la variable para intoducir numeros enteros largos?");
		System.out.println("Opcion 1: Int.");
		System.out.println("Opcion 2: Long.");
		System.out.println("Opcion 3: Byte.");
		preg1=sc.nextInt();
		switch (preg1) {
		case 1:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 2.");
			break;
		case 2:
			System.out.println("Respuesta correcta.");
			nota=nota+1;
			break;
		case 3:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 2.");
			break;
		default:
			System.out.println("Respuesta invalida, no puntua.");
			break;
		}
		System.out.println("Segunda pregunta: Cual es el nombre de la variable condicional simple?");
		System.out.println("Opcion 1: if.");
		System.out.println("Opcion 2: switch.");
		System.out.println("Opcion 3: while.");
		preg2=sc.nextInt();
		switch (preg2) {
		case 1:
			System.out.println("Respuesta correcta.");
			nota=nota+1;
			break;
		case 2:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 1.");
			break;
		case 3:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 1.");
			break;
		default:
			System.out.println("Respuesta invalida, no puntua.");
		}
		System.out.println("Tercera pregunta: Para que sirve la variable switch?");
		System.out.println("Opcion 1: Para agrupar variables.");
		System.out.println("Opcion 2: Para condiciones multiples.");
		System.out.println("Opcion 3: Para introducir valores.");
		preg3=sc.nextInt();
		switch (preg3) {
		case 1:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 2.");
			break;
		case 2:
			System.out.println("Respuesta correcta.");
			nota=nota+1;
			break;
		case 3:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 2.");
			break;
		default:
			System.out.println("Respuesta invalida, no puntua.");
			break;
		}
		System.out.println("Cuarta pregunta: Como se declaran constantes?");
		System.out.println("Opcion 1: Con la variable scanner.");
		System.out.println("Opcion 2: Con la variable double.");
		System.out.println("Opcion 3: Con la variable final.");
		preg4=sc.nextInt();
		switch (preg4) {
		case 1:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 3.");
			break;
		case 2:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 3.");
			break;
		case 3:
			System.out.println("Respuesta correcta.");
			nota=nota+1;
			break;
		default:
			System.out.println("Respuesta invalida, no puntua.");
			break;
		}
		System.out.println("Quinta pregunta: Como se hace un comentario?");
		System.out.println("Opcion 1: Todas son correctas.");
		System.out.println("Opcion 2: Poniendo al principio del comentario /* y al final */.");
		System.out.println("Opcion 3: Poniendo solo al principio del comentario //.");
		preg5=sc.nextInt();
		sc.close();
		switch (preg5) {
		case 1:
			System.out.println("Respuesta correcta.");
			nota=nota+1;
			break;
		case 2:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 1.");
			break;
		case 3:
			System.out.println("Respuesta incorrecta. La correcta era la opcion 1.");
			break;
		default:
			System.out.println("Respuesta invalida, no puntua.");
			break;
		}
		System.out.println("Fin del cuestionario. Tu nota es un "+nota+".");
	}

}
