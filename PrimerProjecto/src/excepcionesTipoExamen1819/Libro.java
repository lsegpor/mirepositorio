package excepcionesTipoExamen1819;

import java.io.Serializable;

public class Libro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String t�tulo;
	private String texto;

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((t�tulo == null) ? 0 : t�tulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (t�tulo == null) {
			if (other.t�tulo != null)
				return false;
		} else if (!t�tulo.equals(other.t�tulo))
			return false;
		return true;
	}

}
