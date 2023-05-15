package examenColecciones2017_18;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Reserva extends HashMap<Area, ListaAnimales> {
	public Set<Area> getListaAreas() {
		return this.keySet();
	}

	public boolean a�ade�rea(Area area) {
		if (this.containsKey(area))
			return false;
		else
			this.put(area, new ListaAnimales());
		return true;
	}

	public void actualizaAnimal(Animal animal, List<Animal> presas) {
		animal.getPresas().addAll(presas);
	}

	public boolean a�ade�rea(String nombre, float extensi�n) {
		// creamos el �rea.
		Area areaNueva = new Area(nombre, extensi�n);
		return this.a�ade�rea(areaNueva);
	}

	public Animal getAnimal(String nombre) {
		for (Area area : this.keySet())
			for (Animal animal : this.get(area))
				if (animal.getNombre().equals(nombre))
					return animal;

		return null;
	}

	public boolean a�adeAnimal(String nombre, Area area, List listaPresas) {
		Animal nuevo = new Animal(nombre, listaPresas);
		for (ListaAnimales lista : this.values())
			if (lista.contains(nuevo))
				return false;

		if (!this.containsKey(area))
			this.put(area, new ListaAnimales());

		// mejor: this.a�adeArea(area);

		this.get(area).add(nuevo);
		return true;
	}

	public String getListadoArea(Area area) {
		String res = "";

		res += "�rea.......:" + area.getNombre() + "\n";
		res += "Extensi�n..:" + area.getExtensi�n() + "\n";
		res += "Animales...:\n";

		for (Animal animal : this.get(area))
			res += animal.datos() + "\n";

		return res;
	}

	public TreeSet<Animal> getListaAnimales() {
		TreeSet<Animal> conjunto = new TreeSet<Animal>();
		for (ListaAnimales lista : this.values())
			for (Animal animal : lista)
				conjunto.add(animal);

		return conjunto;
	}

	public String getListadoTotal() {
		String res = "";
		for (Animal animal : this.getListaAnimales()) {
			res += animal.getNombre() + " se encuentra en: ";
			for (Area area : this.keySet())
				if (this.get(area).contains(animal))
					res += area.getNombre() + "\n";
		}
		return res;
	}

	public String getListadoProblemas() {
		String res = "";
		for (Area area : this.keySet())
			for (Animal depredador : this.get(area))
				for (Animal posiblePresa : depredador.getPresas())
					if (this.get(area).contains(posiblePresa))
						// problema
						res += "Problema: en el �rea " + area.getNombre() + " se encuentra el depredador "
								+ depredador.getNombre() + " y su presa: " + posiblePresa.getNombre() + "\n";

		return res;
	}

}
