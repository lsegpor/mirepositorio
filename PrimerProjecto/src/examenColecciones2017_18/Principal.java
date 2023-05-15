package examenColecciones2017_18;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
	Vista vista;
	Reserva modelo;

	public static void main(String[] args) {
		new Principal();
	}

	private void a�adeDatosDePrueba() {
		Area pradera = new Area("Pradera", 3.4F);
		Area lago = new Area("Orilla del lago", 4.2F);
		Area bosque = new Area("Bosque", 5.4F);

		this.modelo.a�ade�rea("Pradera", 3.4F);
		this.modelo.a�ade�rea("Orilla del lago", 4.2F);
		this.modelo.a�ade�rea("Bosque", 5.4F);

		this.modelo.a�adeAnimal("Le�n", pradera, new LinkedList<Animal>());
		this.modelo.a�adeAnimal("Hiena", pradera, new LinkedList<Animal>());
		this.modelo.a�adeAnimal("Elefante", pradera, new LinkedList<Animal>());

		this.modelo.a�adeAnimal("Gacela", lago, new LinkedList<Animal>());
		this.modelo.a�adeAnimal("�u", lago, new LinkedList<Animal>());
		this.modelo.a�adeAnimal("Cocodrilo", lago, new LinkedList<Animal>());

		this.modelo.a�adeAnimal("Gorila", bosque, new LinkedList<Animal>());
		this.modelo.a�adeAnimal("Tigre", bosque, new LinkedList<Animal>());

		this.vista.actualizaListadoAreasVentana();
		this.vista.actualizaListaAnimales();

	}

	public Principal() {
		this.modelo = new Reserva();
		this.vista = new Vista(this);

		/***********************************/

		this.a�adeDatosDePrueba();

		/***********************************/
	}

	public boolean a�adeAnimal(String nombre, Area area, List listaPresas) {
		return this.modelo.a�adeAnimal(nombre, area, listaPresas);
	}

	public boolean a�ade�rea(String nombre, float extensi�n) {
		return this.modelo.a�ade�rea(nombre, extensi�n);
	}

	public Set<Area> getlistaAreas() {
		return this.modelo.getListaAreas();
	}

	public TreeSet<Animal> getListaAnimales() {
		return this.modelo.getListaAnimales();
	}

	public String getListadoArea(Area area) {
		return this.modelo.getListadoArea(area);
	}

	public Animal getAnimal(String nombre) {
		return this.modelo.getAnimal(nombre);
	}

	public void actualizaAnimal(Animal animalSeleccionado, List<Animal> presas) {
		this.modelo.actualizaAnimal(animalSeleccionado, presas);

	}

	public String getListadoTotal() {
		return this.modelo.getListadoTotal();
	}

	public String getListadoProblemas() {
		return this.modelo.getListadoProblemas();
	}
}
