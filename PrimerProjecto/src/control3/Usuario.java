package control3;

public class Usuario {
	private String nombre;
	private String apellido;
	private int identificacion;
	private Prestamo[] prestamos;
	private int numPrestamos;

	public Usuario(String nombre, String apellido, int identificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.prestamos = new Prestamo[10]; // Inicializamos el array con capacidad para 10 objetos
		this.numPrestamos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public Prestamo[] getPrestamos() {
		return prestamos;
	}

	public int getNumPrestamos() {
		return numPrestamos;
	}

	// agrega el prestamo
	public boolean agregarPrestamo(Prestamo prestamo) {
		boolean anyadido = false;
		// if (prestamo.getMaterialBibliografico().prestar()) {
		if (numPrestamos < prestamos.length) {
			prestamos[numPrestamos] = prestamo;
			numPrestamos++;
			anyadido = true;
		}
		// }
		return anyadido;
	}

	public String toString() {
		String cad = identificacion + ":" + nombre + " " + apellido;
		for (int i = 0; i < numPrestamos; i++) {
			cad += "\n\tPrestamo " + (i + 1) + ": " + prestamos[i].getMaterialBibliografico() + " - Fecha de prestamo: "
					+ prestamos[i].getFechaPrestamo() + " - Fecha de devolucion: " + prestamos[i].getFechaDevolucion();
		}
		return cad;
	}

}