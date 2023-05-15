package poo1;

public class Hora {
	//atributos
	private int horas;
	private int minutos;
	private int segundos;
	
	//constructores
	public Hora() {
		super();
	}

	public Hora(int horas, int minutos, int segundos) {
		super();
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	//getters y setters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas<24) {
			this.horas = horas;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos<60) {
			this.minutos = minutos;
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos<60) {
			this.segundos = segundos;
		}
	}
	
	//método
	public void addSegundos(int segundosAnyadidos) {
		segundos+=segundosAnyadidos;
		minutos+=(segundos/60);
		horas+=(minutos/60);
		if (horas>=24) {
			horas=0;
		}
		minutos=minutos%60;
		segundos=segundos%60;
		
	}
	
	public String toString() {
		return "Horas: "+horas+", minutos: "+minutos+", segundos: "+segundos+".";
	}
	
	
}
