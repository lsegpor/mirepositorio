package control4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Modelo {
	private HashMap<Jugador, TreeSet<Monstruo>> jugadoresMonstruosDispo = new HashMap<>();
	private TreeSet<Monstruo> todosLosMonstruos = new TreeSet<>();
	private ArrayList<Partida> partidas = new ArrayList<>();

	public Modelo() {
		super();
	}

	public HashMap<Jugador, TreeSet<Monstruo>> getJugadoresMonstruosDisponibles() {
		return jugadoresMonstruosDispo;
	}

	public TreeSet<Monstruo> getTodosLosMonstruos() {
		return todosLosMonstruos;
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	@Override
	public String toString() {
		return "Modelo [jugadoresMonstruosDisponibles=" + jugadoresMonstruosDispo + "\ntodosLosMonstruos="
				+ todosLosMonstruos + "\npartidas=" + partidas + "]";
	}

	// a)
	// devuelve el monstruo que está disponible para mayor número de jugadores.
	// a igualdad de repeticiones, devuelve uno de ellos, no importa cual.
	public Monstruo getMonstruoDisponibleMasJugadores() {
		int contMax = -1;
		Monstruo mMasDisponible = null;
		for (Monstruo m : todosLosMonstruos) {
			int contActual = 0;
			for (Jugador j : this.jugadoresMonstruosDispo.keySet()) {
				if (this.jugadoresMonstruosDispo.get(j).contains(m)) {
					contActual++;
				}
			}
			if (contActual > contMax) {
				contMax = contActual;
				mMasDisponible = m;
			}
		}
		return mMasDisponible;
	}

	// b)
	// Calcula y devuelve la media de coste total de monstruos disponibles de cada jugador:
	public float costeMedio() {
		float media = 0;
		int numJugadores = this.jugadoresMonstruosDispo.size();
		for (TreeSet<Monstruo> conjMonstruos : this.jugadoresMonstruosDispo.values()) {
			int sumaMonstruoActual = 0;
			for (Monstruo m : conjMonstruos) {
				sumaMonstruoActual += m.getCoste();
			}
			media += sumaMonstruoActual;
		}
		return numJugadores == 0 ? 0 : media / numJugadores;
	}

	// c) Devuelve un mapa con entradas de tipo <Jugador, Integer> indicando el
	// número de partidas en las que va ganando cada jugador (no se suma si va empate).
	public HashMap<Jugador, Integer> numPartidasGanador() {
		HashMap<Jugador, Integer> jugadorNumPartidas = new HashMap<>();
		Set<Jugador> jugadores = jugadoresMonstruosDispo.keySet();
		for (Jugador j : jugadores) {
			int contPartidasGanadas = 0;
			for (Partida p : this.partidas) {
				int pos = p.getPos(j);
				if (pos > -1 && p.getPuntosJugadores().get(pos) > p.getPuntosJugadores().get(1 - pos)) {
					contPartidasGanadas++;
				}
			}
			jugadorNumPartidas.put(j, contPartidasGanadas);
		}
		return jugadorNumPartidas;
	}

	// d) este método devolverá una lista con las partidas en las que hay algún jugador
	// que tiene un monstruo en la
	// partida que no está entre los monstruos disponibles para ese jugador.
	public ArrayList<Partida> partidasConErrores() {
		ArrayList<Partida> partidasConError = new ArrayList<>();
		for (Partida p : this.partidas) {
			if (hayError(p)) {
				partidasConError.add(p);
			}
		}
		return partidasConError;
	}
	
	private boolean hayError(Partida p) {
		boolean hayError = false;
		Iterator<TreeSet<Monstruo>> it = p.getMonstruosJugadoresEnPartida().iterator();
		int posJugador = 0;
		while (it.hasNext()) {
			TreeSet<Monstruo> monstruosJugadorPartida = it.next();
			Jugador jugador = p.getJugadores().get(posJugador++);
			Iterator<Monstruo> itMonstruo = monstruosJugadorPartida.iterator();
			while (itMonstruo.hasNext() && !hayError) {
				Monstruo m = itMonstruo.next();
				if (!this.jugadoresMonstruosDispo.get(jugador).contains(m)) {
					hayError = true;
				}
			}
		}
		return hayError;
	}

}
