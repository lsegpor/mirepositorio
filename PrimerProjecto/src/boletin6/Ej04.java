package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave
secreta. La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al
5 (siendo n la longitud indicada anteriormente por el usuario). El jugador introduce ahora una
combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor
menor o igual que el correspondiente de la combinación secreta.*/

public class Ej04 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce un numero.");
			int num=sc.nextInt();
			int clave[]=new int [num];
			for (int i=0; i<clave.length; i++) {
				clave[i]=(int)Math.floor(Math.random()*10);
			}
			int intentoClave[]=new int [num];
			System.out.println("Adivina la clave de "+num+" digitos.");
			for (int j=0; j<intentoClave.length; j++) {
				System.out.println("Introduce un digito.");
				intentoClave[j]=sc.nextInt();
			}
			while (Arrays.equals(clave, intentoClave)==false) {
				for (int k=0; k<clave.length; k++) {
					if (clave[k]==intentoClave[k]) {
						System.out.println(intentoClave[k]+" es igual.");
					} else if (clave[k]<intentoClave[k]) {
						System.out.println(intentoClave[k]+" es mayor.");
					} else {
						System.out.println(intentoClave[k]+" es menor.");
					}
				}
				System.out.println("Intentelo de nuevo.");
				for (int j=0; j<intentoClave.length; j++) {
					System.out.println("Introduce un digito.");
					intentoClave[j]=sc.nextInt();
				}
			}
			System.out.println("Acertaste la clave!");
		}
	}
}