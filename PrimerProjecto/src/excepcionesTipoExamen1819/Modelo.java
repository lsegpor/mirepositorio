package excepcionesTipoExamen1819;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Modelo extends HashMap<Libro, Estadisticas> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int CORRECTO = 0;
	public static final int ERROR = 1;
	public static final int CANCELADO = 2;

	private JFileChooser selectorFicheros;
	private FileNameExtensionFilter filtroSer;
	private FileNameExtensionFilter filtroTxt;

	public Modelo() {
		this.creaFiltrosyChoosers();
	}

	public void creaFiltrosyChoosers() {
		this.filtroSer = new FileNameExtensionFilter("Fichero de estadísticas serializados", "ser");
		this.filtroTxt = new FileNameExtensionFilter("Fichero del texto de un libro", "txt");
		this.selectorFicheros = new JFileChooser();
		this.selectorFicheros.addChoosableFileFilter(this.filtroSer);
		this.selectorFicheros.addChoosableFileFilter(this.filtroTxt);
	}

	public Set<Libro> getConjuntoLibros() {
		return this.keySet();
	}

	public Libro getLibroPorTítulo(String título) {
		for (Libro libro : this.keySet())
			if (libro.getTítulo().equals(título))
				return libro;
		return null;
	}

	public int guardarMapaSerializado(Ventana ventana) throws FileNotFoundException, IOException {
		return 0;
	}

	public int comprobarModeloSerializado(Ventana ventana)
			throws IOException, FileNotFoundException, ClassNotFoundException, ClassCastException {
		return 0;
	}

	public Libro cargarLibro(Ventana padreDelFileChooser) throws FileNotFoundException, IOException {
		return null;
	}

	public Estadisticas obtenEstadísticasYAñadeAlModelo(Libro libro) {
		return null;
	}

}
