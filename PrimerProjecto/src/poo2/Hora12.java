package poo2;

public class Hora12 extends Hora {
	private Meridiano meridiano;

	public Hora12() {
		super();
		horas=1;
		meridiano=Meridiano.AM;
	}
	
	public Hora12(int horas, int minutos, Meridiano meridiano) {
		super(horas, minutos);
		setMeridiano(meridiano);
	}
	
	public void setHoras(int horas) {
		if (horas>=1 && horas<=12) {
			this.horas = horas;
		}else {
			this.horas=1;
		}
	}

	public Meridiano getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(Meridiano meridiano) {
		this.meridiano = meridiano;
	}
	
	@Override
	public void inc() {
		super.inc();
		if(horas==1 && minutos==0) {
			cambiaMeridiano();
		}
	}
	
	public void cambiaMeridiano() {
		if (meridiano==Meridiano.AM) {
			meridiano=Meridiano.PM;
		} else {
			meridiano=Meridiano.AM;
		}
	}

	@Override
	public String toString() {
		return super.toString()+" "+meridiano;
	}
	
	
}
