package ejsTipoExamen;
import java.util.Scanner;

public class Ej2021_6 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String nomAutor, nomLibro, libroBarato1, libroBarato2, libroCaro, libroCaroMas2;
			char sexo, sexoMasVendido;
			int numAutores, numAutoresH, numAutoresM, unidades, i, numLibros, mujeresMas3libros;
			float precio, gastado, gastadoTotal, masGastado, precioMin1, precioMin2, precioMax;
			double porcent;
			numAutoresH=0;
			numAutoresM=0;
			masGastado=0;
			sexoMasVendido=0;
			numLibros=0;
			mujeresMas3libros=0;
			gastadoTotal=0;
			precioMin1=Float.MAX_VALUE;
			precioMin2=Float.MAX_VALUE;
			precioMax=Float.MIN_VALUE;
			libroCaro=null;
			libroCaroMas2=null;
			libroBarato1=null;
			libroBarato2=null;
			
			System.out.print("Numero de autores: ");
			numAutores=sc.nextInt();
			for (i=1; i<=numAutores; i++) {
				System.out.print("Nombre: ");
				nomAutor=sc.next();
				System.out.print("Sexo (M/H): ");
				sexo=sc.next().charAt(0);
				if (sexo=='H') {
					numAutoresH++;
				} else if (sexo=='M') {
					numAutoresM++;
				}
				System.out.print("Titulo del libro: ");
				nomLibro=sc.next();
				while (!nomLibro.equals("fin")) {
					numLibros++;
					System.out.print("Precio unitario: ");
					precio=sc.nextFloat();
					System.out.print("Numero de unidades vendidas: ");
					unidades=sc.nextInt();
					gastado=precio*unidades;
					gastadoTotal=gastadoTotal+gastado;
					if (numLibros==3 && sexo=='M') {
						mujeresMas3libros++;
					}
					if (precio>precioMax) {
						precioMax=precio;
						libroCaro=nomLibro;
					}
					if (precio<precioMin1) {
						precioMin2=precioMin1;
						libroBarato2=libroBarato1;
						precioMin1=precio;
						libroBarato1=nomLibro;
					} else if (precio<precioMin2) {
						precioMin2=precio;
						libroBarato2=nomLibro;
					}
					System.out.print("Titulo del libro: ");
					nomLibro=sc.next();
				}
				if (numLibros>=2) {
					libroCaroMas2=libroCaro;
				}
				if (gastadoTotal>masGastado) {
					masGastado=gastadoTotal;
					sexoMasVendido=sexo;
				}
				gastadoTotal=0;
				numLibros=0;
			}
			porcent=100*(double)numAutoresM/(numAutoresM+numAutoresH);
			System.out.println("a) Porcentaje de autores que son mujer: "+porcent+"%.");
			System.out.println("b) Sexo del autor en el que mas se han gastado los clientes: "+sexoMasVendido+".");
			System.out.println("c) Numero de autoras que han escrito 3 libros o mas: "+mujeresMas3libros+".");
			System.out.println("d) Los dos libros mas baratos son: "+libroBarato1+" y "+libroBarato2+".");
			System.out.println("e) Titulo del libro mas caro de autores de mas de 2 libros: "+libroCaroMas2+".");
		}
	}
}