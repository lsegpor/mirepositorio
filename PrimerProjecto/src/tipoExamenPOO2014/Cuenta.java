package tipoExamenPOO2014;

public class Cuenta {
	private long numero;
	private Cliente cliente;
	private Movimiento[] tMovs;
	private int nMovs;
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Movimiento[] gettMovs() {
		return tMovs;
	}
	public int getnMovs() {
		return nMovs;
	}
	
	
	
}