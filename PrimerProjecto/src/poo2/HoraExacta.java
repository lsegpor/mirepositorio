package poo2;

import java.util.Objects;

public class HoraExacta extends Hora {
	private int segundos;

	public HoraExacta() {
		super();
	}

	public HoraExacta(int horas, int minutos, int segundos) {
		super(horas, minutos);
		setSegundos(segundos);
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos>=0 && segundos<60) {
			this.segundos = segundos;
		}
	}
	
	@Override
	public void inc() {
		if (segundos+1>=60) {
			super.inc();
			segundos=0;
		} else {
			segundos+=1;
		}
	}

	@Override
	public String toString() {
		return super.toString()+":"+segundos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoraExacta other = (HoraExacta) obj;
		return segundos == other.segundos && horas==other.horas && minutos==other.minutos;
	}
}
