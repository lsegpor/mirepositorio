package examenColecciones2016_17;

public class Socio {
	private String nombre;
	private int antiguedad;

	public Socio(String nombre, int antiguedad) {
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}

	public String toString() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + antiguedad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Socio other = (Socio) obj;
		if (antiguedad != other.antiguedad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}