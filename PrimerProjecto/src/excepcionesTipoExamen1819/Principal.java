package excepcionesTipoExamen1819;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public class Principal {
	Modelo modelo;
	Ventana vista;

	public static void main(String args[]) {
		new Principal();
	}

	public Principal() {
		this.vista = new Ventana(this);
		this.modelo = new Modelo();
		this.vista.mostrar();
	}

	public Libro cargarLibro(Ventana vista) throws FileNotFoundException, IOException {
		return this.modelo.cargarLibro(vista);
	}

	public Estadisticas obtenEstad�sticasYA�adeAlModelo(Libro libroActual) {
		return this.modelo.obtenEstad�sticasYA�adeAlModelo(libroActual);
	}

	public Set<Libro> getConjuntoLibros() {
		return this.modelo.getConjuntoLibros();
	}

	public Libro getLibroPorT�tulo(String t�tulo) {
		return this.modelo.getLibroPorT�tulo(t�tulo);
	}

	public int guardarModeloSerializado(Ventana ventana) throws FileNotFoundException, IOException {
		return this.modelo.guardarMapaSerializado(ventana);
	}

	public int comprobarModeloSerializado(Ventana ventana)
			throws FileNotFoundException, ClassNotFoundException, IOException, ClassCastException {
		return this.modelo.comprobarModeloSerializado(ventana);
	}

}
