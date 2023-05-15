package control3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {

	private MaterialBibliografico[] materiales;
	private int numMateriales;
	private Usuario[] usuarios;
	private int numUsuarios;

	public Biblioteca(int tamMax) {
		this.materiales = new MaterialBibliografico[tamMax];
		this.numMateriales = 0;
		this.usuarios = new Usuario[tamMax];
		this.numUsuarios = 0;
	}

	public MaterialBibliografico[] getMateriales() {
		return materiales;
	}

	public int getNumMateriales() {
		return numMateriales;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public int getNumUsuarios() {
		return numUsuarios;
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios[numUsuarios] = usuario;
		numUsuarios++;
	}

	public boolean addMaterial(MaterialBibliografico m) {
		boolean anyadido = false;
		if (numMateriales < materiales.length) {
			materiales[numMateriales++] = m;
			anyadido = true;
		}
		return anyadido;
	}

	public String toString() {
		String cadBiblio = "";
		for (int i = 0; i < numMateriales; i++) {
			cadBiblio += "\n" + materiales[i].toString();
		}
		return cadBiblio;
	}

	// a)
	/*
	 * que devuelve una tabla de objetos de la clase MaterialBibliografico con todos
	 * materiales ordenados. El tamaño de la tabla debe ser el del numero de
	 * materiales que contenga. El orden natural de los objetos
	 * MaterialBibliografico es por año de publicacion de manera descendente (los
	 * años mas actuales van primero, y al final, los mas antiguos). A igualdad de
	 * año, se ordenan ascendentemente por titulo. Crea el metodo que corresponda
	 * para implementar esta ordenacion.
	 */
	public MaterialBibliografico[] getMaterialesOrdenados() {
		return null;
	}

	// b)
	/*
	 * que busca dicho usuario entre los de la biblioteca, y le agrega el prestamo
	 * recibido como parametro a sus prestamos. Si el material o el usuario no estan
	 * registrados en la biblioteca, o el material esta marcado como prestado en los
	 * materiales de la biblioteca, el prestamo no debe incluirse. Devuelve true o
	 * false dependiendo de si el prestamo ha sido registrado o no. Se considera un
	 * material igual que otro si su titulo, autor y año de publicacion son iguales.
	 * Se considera un usuario igual que otro si su numero de identificacion es
	 * igual. Cabo suelto: Notese que no estamos actualizando el campo prestado del
	 * material cuando el prestamo se realiza. Ya lo haremos en el metodo del
	 * apartado d).
	 */

	public boolean agregarPrestamo(Prestamo prestamo, Usuario usuario) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null && usuarios[i].getIdentificacion() == usuario.getIdentificacion()) {
				for (int j = 0; j < this.materiales.length; j++) {
					if (this.materiales[j] != null) {
						if (this.materiales[j].titulo.equals(prestamo.getMaterialBibliografico().titulo)
								&& this.materiales[j].autor.equals(prestamo.getMaterialBibliografico().autor)
								&& this.materiales[j].anyoPublicacion == prestamo.getMaterialBibliografico().anyoPublicacion) {
							if (prestamo.getMaterialBibliografico().prestado == false) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;

	}

	// c)
	/*
	 * Metodo que marca el material como devuelto tanto en los materiales de la
	 * biblioteca como en los materiales de los prestamos de los usuarios de la
	 * biblioteca, e indica la fecha de devolucion en sus prestamos.
	 */
	public void devolver(MaterialBibliografico mat, LocalDate fechaDev) {
		
	}

	// d)
	/*
	 * Actualiza el campo prestado del material bibliografico de la biblioteca
	 * teniendo en cuenta los prestamos de los usuarios. Si para un material, hay
	 * algun prestamo de alguno de los usuarios cuya fecha de devolucion sea nula,
	 * quiere decir que esta prestado, y si no hay prestamos, o los que hay tienen
	 * fecha de devolucion, es que ese material no esta prestado.
	 */
	public void actualizaMaterialesPrestados() {

	}

	// e)
	/*
	 * Devuelve un array -del tamaño justo- con los prestamos asociados al material
	 * que se pasa como parametro.
	 */
	public Prestamo[] prestamosDeMaterial(MaterialBibliografico material) {
		return null;
	}

}