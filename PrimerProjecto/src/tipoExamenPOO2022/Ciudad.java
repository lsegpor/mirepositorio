package tipoExamenPOO2022;

public class Ciudad {
	private String nombre;
	private int numHabitantes;

	public Ciudad(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		boolean res = other.nombre.toLowerCase().equals(this.nombre.toLowerCase());
		if (res) {
			res = Math.abs(this.numHabitantes - other.numHabitantes) <= 100;
		}
		return res;
	}

	@Override
	public String toString() {
		return " " + nombre + "(" + numHabitantes + ") ";
	}

}