package control3;

public class Periodico extends MaterialBibliografico {
	private String fechaPublicacion;

	public Periodico(String titulo, String autor, int anyoPublicacion, String fechaPublicacion) {
		super(titulo, autor, anyoPublicacion);
		this.fechaPublicacion = fechaPublicacion;
	}

	public String toString() {
		return super.toString() + "\nFecha de publicacion: " + this.fechaPublicacion;
	}
}