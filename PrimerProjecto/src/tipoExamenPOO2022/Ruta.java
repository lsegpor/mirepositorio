package tipoExamenPOO2022;

public class Ruta implements Comparable<Ruta> {
	private Ciudad origen;
	private Ciudad destino;
	private int kilometros;

	public Ruta(Ciudad origen, Ciudad destino, int kilometros) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.kilometros = kilometros;
	}

	public Ciudad getOrigen() {
		return origen;
	}

	public void setOrigen(Ciudad origen) {
		this.origen = origen;
	}

	public Ciudad getDestino() {
		return destino;
	}

	public void setDestino(Ciudad destino) {
		this.destino = destino;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "\n\tRuta [origen=" + origen + ", destino=" + destino + ", kilometros=" + kilometros + "]";
	}

	@Override
	public int compareTo(Ruta o) {
		return this.kilometros - o.kilometros;
	}

}