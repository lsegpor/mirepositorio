package poo2;

public class Caja {
	protected final int ANCHO;
	protected final int ALTO;
	protected final int FONDO;
	protected final Unidades UNIDAD;
	
	public Caja(int aNCHO, int aLTO, int fONDO, Unidades uNIDAD) {
		super();
		ANCHO=aNCHO;
		ALTO=aLTO;
		FONDO=fONDO;
		UNIDAD=uNIDAD;
	}

	public int getANCHO() {
		return ANCHO;
	}

	public int getALTO() {
		return ALTO;
	}

	public int getFONDO() {
		return FONDO;
	}

	public Unidades getUNIDAD() {
		return UNIDAD;
	}
	
	public double getVolumen () {
		return (ANCHO*ALTO*FONDO);
	}

	@Override
	public String toString() {
		return "Caja --> ancho: "+ANCHO+", alto: "+ALTO+", fondo: "+FONDO+", unidad: "+UNIDAD+", volumen: "+getVolumen()+".";
	}
	
	
}
