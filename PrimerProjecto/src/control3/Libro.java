package control3;

public class Libro extends MaterialBibliografico {
	private int numeroPaginas;

	public Libro(String titulo, String autor, int anyoPublicacion, int numeroPaginas) {
		super(titulo, autor, anyoPublicacion);
		this.numeroPaginas = numeroPaginas;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String toString() {
		return super.toString() + "\nNumero de paginas: " + this.numeroPaginas;
	}

}