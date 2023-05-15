package examenColecciones2016_17;

import java.util.LinkedList;

public class Principal {
	private Modelo modelo;
	private VentanaPpal vista;

	public static void main(String args[]) {
		new Principal();
	}

	public Principal() {
		this.modelo = new Modelo();
		this.vista = new VentanaPpal(this);
		this.vista.setVisible(true);

		//// CREACION DE LOS DATOS DE PRUEBA

		modelo.getListaSocios().add(new Socio("Alvarez Caballero, Fernando Javier", 0));
		modelo.getListaSocios().add(new Socio("Berenguer Borrego, Fernando", 0));
		modelo.getListaSocios().add(new Socio("Cabanillas Galvez, Ezequiel", 0));
		modelo.getListaSocios().add(new Socio("Campano Laborda, Jose Antonio", 0));
		modelo.getListaSocios().add(new Socio("Carmona Montiel, Miguel", 0));
		modelo.getListaSocios().add(new Socio("Castanyeda Castanyo, Alejandro ", 0));
		modelo.getListaSocios().add(new Socio("Cervilla Campoy, Sergio", 0));
		modelo.getListaSocios().add(new Socio("De la Fuente Campanya, Antonio", 0));
		modelo.getListaSocios().add(new Socio("Dominguez Bermudez, Marina Pilar", 0));
		modelo.getListaSocios().add(new Socio("Domonguez Gonzalez, Adrian", 0));
		modelo.getListaSocios().add(new Socio("Garcia Alves, Diego", 0));
		modelo.getListaSocios().add(new Socio("Garcia Moreno, Josr Maria", 0));
		modelo.getListaSocios().add(new Socio("Garrido Hernandez, Juan Manuel", 0));
		modelo.getListaSocios().add(new Socio("Garrocho Prados, Manuel", 0));
		modelo.getListaSocios().add(new Socio("Hernando Ortega, Ivan", 0));
		modelo.getListaSocios().add(new Socio("Herrera Pozas, David", 0));
		modelo.getListaSocios().add(new Socio("Iglesias Garc�a, Javier Manuel", 0));
		modelo.getListaSocios().add(new Socio("Mallan Rodriguez, Juan", 0));
		modelo.getListaSocios().add(new Socio("Menacho Pantoja, Fernando David", 0));
		modelo.getListaSocios().add(new Socio("Nunyez Tocin, Alejandro", 0));
		modelo.getListaSocios().add(new Socio("Ocampos Buendia, David", 0));
		modelo.getListaSocios().add(new Socio("Perez Vilches, Luis", 0));
		modelo.getListaSocios().add(new Socio("Rodriguez Martinez, Juan Antonio", 0));
		modelo.getListaSocios().add(new Socio("Sanchez Verdugo, Alvaro", 0));
		modelo.getListaSocios().add(new Socio("Serrano Garcia, Valme Maria", 0));

		modelo.anyadeArticulo("Coca Cola", "Grande", 1.2F);
		modelo.anyadeArticulo("Coca Cola", "Mediano", 1.0F);
		modelo.anyadeArticulo("Coca Cola", "Pequenyo", 0.9F);
		modelo.anyadeArticulo("Manzanilla", "Mediano", 4.2F);
		modelo.anyadeArticulo("Tortilla", "Grande", 4.2F);
		modelo.anyadeArticulo("Jamon", "Mediano", 9.0F);
		modelo.anyadeArticulo("Jamon", "Grande", 10.2F);
		modelo.anyadeArticulo("Jamon", "Pequenyo", 6.5F);
		modelo.anyadeArticulo("Rebujito", "Grande", 12.0F);

		this.vista.actualizaComboSocios();
		this.vista.actualizaComboArticulos();

		/// FIN DE LA CREACION DE DATOS DE PRUEBA
	}

	public boolean anyadeArticulo(String nombre, float precio, String tamanyo) {
		return this.modelo.anyadeArticulo(nombre, tamanyo, precio);
	}

	public boolean borraArticulo(String nombre, String tamanyo) {
		return this.modelo.borraArticulo(nombre, tamanyo);
	}

	public ListaSocios getListaSocios() {
		return this.modelo.getListaSocios();
	}

	public ListaPrecios getListaPrecios() {
		return this.modelo.getListaPrecios();
	}

	public boolean hayCuentaPendienteConEseArticulo(String nombre, String tamanyo) {
		return this.modelo.hayCuentaPendienteConEseArticulo(nombre, tamanyo);
	}

	public void anyadeConsumicion(Socio socio, Articulo articulo, int cantidad) {
		this.modelo.anyadeConsumicion(socio, articulo, cantidad);
	}

	public LinkedList<Consumicion> getListaConsumiciones(Socio socio) {
		return this.modelo.getListaConsumiciones(socio);
	}

	public String calculaTotal(Socio socio) {
		return this.modelo.calculaTotalCuenta(socio);
	}

}