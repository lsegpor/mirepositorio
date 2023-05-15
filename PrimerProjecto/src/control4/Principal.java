package control4;

import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		// creación de todos los monstruos
		Monstruo electricat = new Monstruo(1, "Electricat", 694, 470);
		Monstruo tickels = new Monstruo(1, "Tickels", 817, 218);
		Monstruo maggie = new Monstruo(2, "Maggie", 654, 490);
		Monstruo k9000 = new Monstruo(2, "K-9000", 1264, 431);
		Monstruo cassowary = new Monstruo(2, "Cassowary", 708, 463);
		Monstruo boMangles = new Monstruo(3, "BoMangles", 1735, 470);
		Monstruo jarCannon = new Monstruo(3, "Jar Cannon", 470, 246);
		Monstruo sheepingGas = new Monstruo(4, "Sheeping Gas", 1567, 644);
		Monstruo werewolf = new Monstruo(4, "Werewolf", 1035, 305);
		Monstruo unbereable = new Monstruo(4, "Unbereable", 2014, 420);

		// creación de jugadores
		Jugador jErMaster = new Jugador("ermaster");
		Jugador jCompadre = new Jugador("compadre");
		Jugador jArgoMejor = new Jugador("argoMejor");
		Jugador jMachine = new Jugador("machine");

		// insertamos todos los anteriores como monstruos disponibles en el modelo
		Modelo modelo = new Modelo();
		modelo.getTodosLosMonstruos().add(tickels);//2
		modelo.getTodosLosMonstruos().add(maggie);//1
		modelo.getTodosLosMonstruos().add(k9000);//2
		modelo.getTodosLosMonstruos().add(cassowary);//0
		modelo.getTodosLosMonstruos().add(electricat);//3
		modelo.getTodosLosMonstruos().add(boMangles);//0
		modelo.getTodosLosMonstruos().add(jarCannon);//2
		modelo.getTodosLosMonstruos().add(sheepingGas);//2
		modelo.getTodosLosMonstruos().add(werewolf);//2
		modelo.getTodosLosMonstruos().add(unbereable);//2

		// creamos los conjuntos de monstruos de cada jugador, e insertamos a cada
		// jugador con su correspondiente conjunto de monstruos disponibles
		TreeSet<Monstruo> monstruosErMaster = new TreeSet<>();
		monstruosErMaster.add(unbereable);//coste 4
		monstruosErMaster.add(jarCannon);//coste 3
		monstruosErMaster.add(electricat);//coste 1
		monstruosErMaster.add(tickels);	//coste 1	
		modelo.getJugadoresMonstruosDisponibles().put(jErMaster, monstruosErMaster);//coste total: 9
		
		TreeSet<Monstruo> monstruosCompadre = new TreeSet<>();
		monstruosCompadre.add(tickels);//coste 1
		monstruosCompadre.add(electricat);//coste 1
		monstruosCompadre.add(k9000);//coste 2
		monstruosCompadre.add(werewolf);//coste 4
		modelo.getJugadoresMonstruosDisponibles().put(jCompadre, monstruosCompadre);//coste total: 8

		TreeSet<Monstruo> monstruosArgoMejor = new TreeSet<>();
		monstruosArgoMejor.add(sheepingGas);//coste 4
		monstruosArgoMejor.add(jarCannon);//coste 3
		monstruosArgoMejor.add(maggie);//coste 2
		monstruosArgoMejor.add(k9000);//coste 2
		monstruosArgoMejor.add(werewolf);//coste 4
		modelo.getJugadoresMonstruosDisponibles().put(jArgoMejor, monstruosArgoMejor);//coste total: 15
		
		TreeSet<Monstruo> monstruosMachine = new TreeSet<>();
		monstruosMachine.add(sheepingGas);//coste 4
		monstruosMachine.add(unbereable);//coste 4
		monstruosMachine.add(electricat);//coste 1
		modelo.getJugadoresMonstruosDisponibles().put(jMachine, monstruosMachine);//coste total: 9
		
		//Creo partidas y las añado al modelo
		Partida p1= new Partida(jArgoMejor, jErMaster);
		Partida p2= new Partida(jErMaster, jCompadre);
		Partida p3= new Partida(jMachine, jArgoMejor);
		Partida p4= new Partida(jErMaster, jArgoMejor);
		Partida p5= new Partida(jMachine, jArgoMejor);
		
		modelo.getPartidas().add(p1);
		modelo.getPartidas().add(p2);
		modelo.getPartidas().add(p3);
		modelo.getPartidas().add(p4);
		modelo.getPartidas().add(p5);
		
		//añadimos algunos monstruos de cada jugador a una partida
		p1.addMonstruo(jArgoMejor, maggie);
		p1.addMonstruo(jArgoMejor, werewolf);
		p1.addMonstruo(jErMaster, unbereable);
		//el jugador jArgoMejor tiene 1 punto y el jugador jErMaster tiene 2 por ahora
		p1.getPuntosJugadores().set(0, 1); 
		p1.getPuntosJugadores().set(1, 2); 
		
		p2.addMonstruo(jCompadre, k9000);
		p2.addMonstruo(jCompadre, werewolf);
		p2.addMonstruo(jErMaster, unbereable);
		p2.addMonstruo(jErMaster, tickels);
		//el jugador jCompadre tiene 0 puntos y el jugador jErMaster tiene 4 por ahora
		p2.getPuntosJugadores().set(0, 0); 
		p2.getPuntosJugadores().set(1, 4); 
				
		p3.addMonstruo(jMachine, electricat);
		p3.addMonstruo(jMachine, unbereable);
		p3.addMonstruo(jArgoMejor, jarCannon);
		p3.addMonstruo(jArgoMejor, maggie);
		p3.addMonstruo(jArgoMejor, k9000);
		//el jugador jMachine tiene 3 puntos y el jugador jArgoMejor tiene 3 por ahora
		p3.getPuntosJugadores().set(0, 0); 
		p3.getPuntosJugadores().set(1, 4); 
		
		//en la partida 4 aun no se han añadido monstruos porque acaba de empezar.
		
		p5.addMonstruo(jMachine, sheepingGas);
		p5.addMonstruo(jArgoMejor, werewolf);
		//el jugador jMachine tiene 1 punto y el jugador jArgoMejor tiene 2 por ahora
		p5.getPuntosJugadores().set(0, 1); 
		p5.getPuntosJugadores().set(1, 2); 
		
		//muestro datos del modelo por ahora:
		System.out.println("--------------Modelo:------------------");
		System.out.println(modelo);
		
		//System.out.println("--------------Monstruos en partidas---------------");
		//System.out.println(p1.getMonstruosJugadoresEnPartida());
		//System.out.println(p2.getMonstruosJugadoresEnPartida());
		//System.out.println(p3.getMonstruosJugadoresEnPartida());
		//System.out.println(p4.getMonstruosJugadoresEnPartida());
		//System.out.println(p5.getMonstruosJugadoresEnPartida());
		
		System.out.println("--------------");
		System.out.println("a) Monstruo disponible para más jugadores (debe salir electricat): "+modelo.getMonstruoDisponibleMasJugadores());
		
		
		
		System.out.println("--------------");
		System.out.println("b) Media de coste total de monstruos de cada jugador: "+modelo.costeMedio());
		
		
		
		System.out.println("--------------");
		System.out.println("c) Jugadores y su número de partidas ganadas: "+modelo.numPartidasGanador());
		
		
		
		System.out.println("--------------");
		System.out.println("d) Partidas con error (no debe dar 2 errores): "+modelo.partidasConErrores());
		
		p2.addMonstruo(jErMaster, sheepingGas);
		p5.addMonstruo(jArgoMejor, unbereable);
		System.out.println("d) Partidas con error (debe dar errores): "+modelo.partidasConErrores());
		
		
		
		System.out.println("--------------");
		System.out.println("e) Puntos de los jugadores antes de ataque en partida p1: "+ p1.getPuntosJugadores());
		System.out.println("e) Monstruos de jArgoMejor antes de ataque en partida p1 (ver puntos salud werewolf 1035): "+ p1.getMonstruosJugadoresEnPartida().get(0));
		
		p1.atacar(jErMaster, unbereable, werewolf); //1035 - 420 = 615
		System.out.println("e) Monstruos de jArgoMejor tras primer ataque en partida p1 (ver puntos salud werewolf 615): "+ p1.getMonstruosJugadoresEnPartida().get(0));
		
		p1.atacar(jErMaster, unbereable, werewolf); //615 - 420 = 195
		System.out.println("e) Monstruos de jArgoMejor tras segundo ataque en partida p1 (ver puntos salud werewolf 195): "+ p1.getMonstruosJugadoresEnPartida().get(0));
		System.out.println("e) Puntos antes de que muera werewolf en partida p1: "+ p1.getPuntosJugadores());
		
		p1.atacar(jErMaster, unbereable, werewolf); //195 - 420 = -225
		System.out.println("e) Monstruos de jArgoMejor tras tercer ataque en partida p1 (ver puntos salud werewolf -225): "+ p1.getMonstruosJugadoresEnPartida().get(0));
		System.out.println("e) Puntos tras morir werewolf en partida p1 (jErMaster -jugador en posición 1- debe tener uno más): "+ p1.getPuntosJugadores());
		
	}

}
