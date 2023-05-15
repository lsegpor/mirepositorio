package examenColecciones2017_18;

public class Area {
	private String nombre;
	private float extensi�n;

	public Area(String nombre, float extensi�n) {
		super();
		this.nombre = nombre;
		this.extensi�n = extensi�n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getExtensi�n() {
		return extensi�n;
	}

	public void setExtensi�n(float extensi�n) {
		this.extensi�n = extensi�n;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Area other = (Area) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String toString() {
		return this.nombre + " (" + this.extensi�n + " Has.)";
	}

}
