package control4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Partida {
	// lista con los dos jugadores que participan en la partida: [jugador1,
	// jugador2]
	private ArrayList<Jugador> jugadores = new ArrayList<>();

	// lista con los puntos de cada jugador: [puntosJugador1, puntosJugador2]
	private ArrayList<Integer> puntosJugadores = new ArrayList<>();

	// lista con el conjunto de monstruos que cada jugador tiene en la partida:
	// [conjMonstruosJugador1, conjMonstruosJugador2]
	private ArrayList<TreeSet<Monstruo>> monstruosJugadoresEnPartida = new ArrayList<>();

	public Partida(Jugador jugador1, Jugador jugador2) {
		super();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		
		//los dos jugadores parten de 0 puntos
		puntosJugadores.add(0);
		puntosJugadores.add(0);
		
		//añado cada jugador con un conjunto (vacío en principio) de monstruos añadidos a la partida
		monstruosJugadoresEnPartida.add(new TreeSet<>());
		monstruosJugadoresEnPartida.add(new TreeSet<>());
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public ArrayList<Integer> getPuntosJugadores() {
		return puntosJugadores;
	}

	public ArrayList<TreeSet<Monstruo>> getMonstruosJugadoresEnPartida() {
		return monstruosJugadoresEnPartida;
	}

	// añade el monstruo del jugador indicado a la partida.
	// devuelve un boolean indicando si ha podido ser añadido o no.
	// No podrá añadir el monstruo cuando el jugador no sea de la partida o ese
	// monstruo ya haya sido añadido por ese jugador
	public boolean addMonstruo(Jugador j, Monstruo m) {
		int posJugador = getPos(j);
		return posJugador!=-1 && monstruosJugadoresEnPartida.get(posJugador).add(m);
	}
	
	//devuelve la posición correspondiente al jugador pasado por parámetro en el ArrayList jugadores.
	//Si el jugador no está en el array, devuelve -1.
	public int getPos(Jugador jugador) {
		int pos = -1;
		if (jugadores.get(0).equals(jugador)) {
			pos = 0;
		} else if (jugadores.get(1).equals(jugador)) {
			pos = 1;
		}
		return pos;
	}

	// e) método que sirve para que el jugadorAtacante ataque con su monstruoAtacante al
	// monstruoAtacado del jugador contrario.
	// El ataque consiste en que se le restan a los puntos de salud del
	// monstruoAtacado los puntos de daño del atacante.
	// Devuelve true si el monstruo atacado ha muerto (muere cuando no le quedan puntos de salud).
	// Si el monstruo atacado ha muerto, se le suma un punto en esta partida al
	// jugador atacante.
	public boolean atacar(Jugador jugadorAtacante, Monstruo monstruoAtacante, Monstruo monstruoAtacado) {
		boolean muere = false;
		int posAtacante = getPos(jugadorAtacante);
		int posAtacado = 1 - posAtacante;
		Iterator<Monstruo> it = monstruosJugadoresEnPartida.get(posAtacado).iterator();
		boolean enc = false;
		while (it.hasNext() && !enc) {
			Monstruo monstruoActual = it.next();
			if (monstruoActual.equals(monstruoAtacado)) {
				enc = true;
				monstruoActual.setNivelSalud(monstruoActual.getNivelSalud() - monstruoAtacante.getNivelDanyo());
				if (monstruoActual.getNivelSalud() <= 0) {
					muere = true;
				}
			}
		}
		if (muere) {
			this.puntosJugadores.set(posAtacante, this.puntosJugadores.get(posAtacante) + 1);
		}
		return muere;
	}

	@Override
	public String toString() {
		return "\nPartida " + jugadores ;
				//+ ", \npuntosJugadores=" + puntosJugadores
				//+ ", \nmostruosJugadoresEnPartida=" + monstruosJugadoresEnPartida + "]";
	}

}
