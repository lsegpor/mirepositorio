package poo2;

public class CajaCarton extends Caja {
	public CajaCarton(int aNCHO, int aLTO, int fONDO, Unidades uNIDAD) {
		super(aNCHO, aLTO, fONDO, uNIDAD);
	}
	
	@Override
	public double getVolumen () {
		return (ANCHO*ALTO*FONDO)*0.8;
	}

	@Override
	public String toString() {
		return "CajaCarton --> ancho: "+ANCHO+", alto: "+ALTO+", fondo: "+FONDO+", unidad: "+UNIDAD+", volumen: "+getVolumen()+ ".";
	}
}
