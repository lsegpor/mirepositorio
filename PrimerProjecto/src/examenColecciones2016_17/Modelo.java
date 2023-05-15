package examenColecciones2016_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Modelo {
	private ListaPrecios listaPrecios;
	private ListaSocios listaSocios;
	private HashMap<Socio, LinkedList<Consumicion>> listaCuentas;

	public Modelo() {
		this.listaPrecios = new ListaPrecios();
		this.listaSocios = new ListaSocios();
		this.listaCuentas = new HashMap<Socio, LinkedList<Consumicion>>();
	}

	public ListaSocios getListaSocios() {
		return this.listaSocios;
	}

	public boolean anyadeArticulo(String nombre, String tamanyo, float precio) {
		return listaPrecios.put(new Articulo(nombre, tamanyo), precio) != null;
		/*Articulo art = new Articulo(nombre, tamanyo);
		 * if (listaPrecios.containsKey(art)) {
		 * 	return false;
		 * } else {
		 * 	listaPrecios.put(art, precio);
		 * 	return true;
		 * }*/
	}

	public boolean borraArticulo(String nombre, String tamanyo) {
		//return listaPrecios.remove(new Articulo(nombre, tamanyo)) != null;
		Articulo art = new Articulo(nombre, tamanyo);
		boolean borrado = false;
		if (listaPrecios.containsKey(art)) {
			listaPrecios.remove(art);
			borrado = true;
		}
		return borrado;
	}

	public ListaPrecios getListaPrecios() {
		return this.listaPrecios;
	}

	public boolean hayCuentaPendienteConEseArticulo(String nombre, String tamanyo) {
		Articulo art = new Articulo(nombre, tamanyo);
		boolean pendiente = false;
		Iterator<Socio> it = listaCuentas.keySet().iterator();
		while (it.hasNext() && !pendiente) {
			Socio s = it.next();
			Iterator<Consumicion> it2 = listaCuentas.get(s).iterator();
			while (it2.hasNext() && !pendiente) {
				Consumicion c = it2.next();
				if (c.getArticulo().equals(art)) {
					pendiente = true;
				}
			}
			/*for (Consumicion c : listaCuentas.get(s)) {
				if (c.getArticulo().equals(art)) {
					pendiente = true;
				}
			}*/
		}
		return pendiente;
	}

	public void anyadeConsumicion(Socio socio, Articulo articulo, int cantidad) {
		if (listaCuentas.containsKey(socio)) {
			listaCuentas.get(socio).add(new Consumicion(articulo, cantidad));
		} else {
			listaCuentas.put(socio, new LinkedList<Consumicion>());
			listaCuentas.get(socio).add(new Consumicion(articulo, cantidad));
		}
	}

	public LinkedList<Consumicion> getListaConsumiciones(Socio socio) {
		if (listaCuentas.containsKey(socio)) {
			return listaCuentas.get(socio);
		} else {
			listaCuentas.put(socio, new LinkedList<Consumicion>());
			return listaCuentas.get(socio);
		}
	}

	public String calculaTotalCuenta(Socio socio) {
		String cuenta = "";
		Float total = 0F;
		if (listaCuentas.containsKey(socio)) {
			for (Consumicion c : listaCuentas.get(socio)) {
				total += listaPrecios.get(c.getArticulo()) * c.getCantidad();
			}
			cuenta = socio + ": " + total + " euros.";
		} else {
			cuenta += "El cliente no tiene nada.";
		}
		return cuenta;
	}
	
	

}