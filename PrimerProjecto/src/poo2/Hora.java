package poo2;

public class Hora {
	protected int horas;
	protected int minutos;
	
	public Hora() {
		super();
	}

	public Hora(int horas, int minutos) {
		super();
		setHoras(horas);
		setMinutos(minutos);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas>=0 && horas<=23) {
			this.horas = horas;
		} else {
			this.horas=0;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos>=0 && minutos<=59) {
			this.minutos = minutos;
		}
	}
	
	public void inc() {
		minutos+=1;
		if (minutos>=60) {
			setHoras(horas+(minutos/60));
			minutos=minutos%60;
		}
	}

	public String toString() {
		return "Hora --> "+horas+":"+minutos;
	}
}
