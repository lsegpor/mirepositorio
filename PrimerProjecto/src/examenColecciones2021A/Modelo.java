package examenColecciones2021A;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Modelo {
	private HashMap<Comercial, TreeSet<Empresa>> asignaciones;
	private Vector<Visita> visitas;

	public Modelo() {
		this.asignaciones = new HashMap<Comercial, TreeSet<Empresa>>();
		this.visitas = new Vector<Visita>();
	}

	public void anyadeComercial(Comercial c) {
		// añade al mapa de asignaciones una nueva pareja con el comercial pasado como
		// parametro y un conjunto nuevo vacio de empresas asignadas.
		TreeSet<Empresa> conjunto = new TreeSet<Empresa>();
		asignaciones.put(c, conjunto);
	}

	public void asignaEmpresaAComercial(Comercial c, Empresa e) {
		// asigna la empresa pasada como parametro al conjunto de empresas que tiene
		// asignadas comercial pasado como parametro.
		asignaciones.get(c).add(e);
	}

	public void anyadeVisita(Visita visita) {
		this.visitas.add(visita);
	}

	public boolean hayErrores() {
		// Devuelve true si hay alguna visita hecha por un comercial a una empresa que
		// NO estaba asignada a ese comercial. Devuelve false en otro caso.
		boolean hayErrores = false;
		Iterator<Visita> it = visitas.iterator();
		while (it.hasNext() && !hayErrores) {
			Visita visita = it.next();
			if (!asignaciones.get(visita.getComercial()).contains(visita.getEmpresa())) {
				hayErrores = true;
			}
		}

		return hayErrores;
	}

	public float totalComprasPorComercial(Comercial c) {
		// Devuelve el total de compras hechas por las empresas asignadas al comercial
		// pasado como parametro.
		float dineros = 0;
		for (Empresa e : asignaciones.get(c)) {
			dineros += e.getCompras();
		}
		return dineros;
	}

	public float totalVentasPorEmpresa(Empresa e) {
		// Devuelve el total de ventas hechas por todos los comerciales asignados a
		// la empresa pasada como parametro.
		float dineros = 0;
		for (Comercial c : asignaciones.keySet()) {
			if (asignaciones.get(c).contains(e)) {
				dineros += c.getVentas();
			}
		}
		return dineros;
	}

	public TreeSet<String> nombresDeEmpresasNoVisitadas() {
		// Devuelve un TreeSet con todas las empresas que no han recibido ninguna
		// visita.
		TreeSet<String> noVisit = new TreeSet<String>();
		for (TreeSet<Empresa> emp : asignaciones.values()) {
			for (Empresa e : emp) {
				boolean visitada = false;
				Iterator<Visita> it = visitas.iterator();
				while (it.hasNext() && !visitada) {
					Visita v = it.next();
					if (v.getEmpresa().equals(e)) {
						visitada = true;
					}
				}
				if (!visitada) {
					noVisit.add(e.getNombre());
				}
			}
		}
		return noVisit;
	}

	public TreeMap<Comercial, LinkedList<Visita>> mapaVisitasPorComercial() {
		// Devuelve un mapa con todos los comerciales como claves, y el valor asociado a
		// cada comercial es una LinkedList de las visitas que ha hecho ese comercial.
		TreeMap<Comercial, LinkedList<Visita>> visit = new TreeMap<Comercial, LinkedList<Visita>>();
		for (Comercial c : asignaciones.keySet()) {
			LinkedList<Visita> visi = new LinkedList<Visita>();
			for (Visita v : visitas) {
				if (v.getComercial().getNombre().equals(c.getNombre())) {
					visi.add(v);
				}
			}
			visit.put(c, visi);
		}
		return visit;
	}

	public TreeSet<Comercial> comercialesQueVisitaronEnElMes(int i) {
		// Devuelve un TreeSet con todos los comerciales que hicieron alguna visita
		// en el mes pasado como parametro.
		TreeSet<Comercial> com = new TreeSet<Comercial>();
		for (Visita v : visitas) {
			if (v.getMes() == 3) {
				com.add(v.getComercial());
			}
		}
		return com;
	}

}
