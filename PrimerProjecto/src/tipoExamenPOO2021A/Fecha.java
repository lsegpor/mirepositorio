package tipoExamenPOO2021A;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;

	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return "" + this.dia + "/" + this.mes + "/" + this.anyo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (anyo != other.anyo)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public int compareTo(Fecha otra) {
		int res = this.anyo - otra.anyo;

		if (res == 0)
			res = this.mes - otra.mes;
		if (res == 0)
			res = this.dia - otra.dia;

		return res;
	}

}