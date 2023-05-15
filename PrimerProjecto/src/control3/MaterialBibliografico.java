package control3;

import java.util.Arrays;
import java.util.Objects;

public abstract class MaterialBibliografico implements Prestable {
	protected String titulo;
	protected String autor;
	protected int anyoPublicacion;
	protected boolean prestado;

	public MaterialBibliografico(String titulo, String autor, int anyoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
		this.prestado = false;
	}

	public MaterialBibliografico(String titulo, int anyoPublicacion) {
		this.titulo = titulo;
		this.autor = "-";
		this.anyoPublicacion = anyoPublicacion;
		this.prestado = false;
	}

	public boolean prestar() {
		boolean puedePrestarse = !estaPrestado();
		if (puedePrestarse) {
			this.prestado = true;
		}
		return puedePrestarse;
	}

	public boolean devolver() {
		boolean puedeDevolverse = estaPrestado();

		if (puedeDevolverse) {
			this.prestado = false;
		}
		return puedeDevolverse;
	}

	public boolean estaPrestado() {
		return this.prestado;
	}

	public String toString() {
		return ("\n\n* Titulo: " + this.titulo + "\n" + "Autor: " + this.autor + "\n" + "anyo de publicacion: "
				+ this.anyoPublicacion + " \nprestado: " + prestado);
	}

}