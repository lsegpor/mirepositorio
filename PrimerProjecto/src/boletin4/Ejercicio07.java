package boletin4;

public class Ejercicio07 {

	public static void main(String[] args) {
		int i, producto;
		producto=1;
		for (i=0; i<=20; i++) {
			if (i%2!=0) {
				producto=producto*i;
			}
		}
		System.out.println("El producto total entre todos los numeros impares menores de 10 es "+producto+".");
	}	
}