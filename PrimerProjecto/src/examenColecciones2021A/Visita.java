package examenColecciones2021A;

public class Visita {
	private int mes;
	private Comercial comercial;
	private Empresa empresa;

	public Visita(Comercial comercial, Empresa empresa, int mes) {
		this.comercial = comercial;
		this.empresa = empresa;
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public Comercial getComercial() {
		return comercial;
	}

	public void setComercial(Comercial comercial) {
		this.comercial = comercial;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return comercial + " visito " + empresa + " el mes de " + mes;
	}

}