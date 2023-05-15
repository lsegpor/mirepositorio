package control3;

import java.util.Arrays;

public class Revista extends MaterialBibliografico {
	private int numero;

	public Revista(String titulo, String autor, int anyoPublicacion, int numero) {
		super(titulo, autor, anyoPublicacion);
		this.numero = numero;
	}

	public Revista(String titulo, int anyoPublicacion, int numero) {
		super(titulo, anyoPublicacion);
		this.numero = numero;
	}

	public String toString() {
		return super.toString() + "\nNumero: " + this.numero;
	}

}