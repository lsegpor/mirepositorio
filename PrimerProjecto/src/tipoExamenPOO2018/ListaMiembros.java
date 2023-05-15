package tipoExamenPOO2018;

import java.util.Arrays;

public class ListaMiembros
{
	private Miembro tabla[];


	public Miembro[] getTabla() {
		return tabla;
	}
	
	public int getTamanyo() {
		return this.tabla.length;
	}

	public ListaMiembros() {
		this.tabla=new Miembro[0];
	}

	public void anyadeMiembro(Miembro m) {
		Miembro[] tablaNueva=new Miembro[this.getTamanyo()+1];
		for(int i=0; i<this.getTamanyo(); i++) {
			tablaNueva[i]=this.tabla[i];
		}
		tablaNueva[this.getTamanyo()]=m;
		this.tabla=tablaNueva;
	}
	
	public void anyadeMiembroSinRepetir(Miembro m) {
		if (!contieneMiembro(m)) {
			anyadeMiembro(m);
		}
	}

	public String toString() {
		return Arrays.toString(this.tabla);
	}


	public boolean contieneMiembro(Miembro m) {
		boolean contiene=false;
		for (int i=0; i<getTamanyo() && !contiene; i++) {
			contiene=this.tabla[i].equals(m);
		}
		return contiene;
	}

	public void eliminaMiembro(Miembro m) {
		boolean contiene=false;
		for (int i=0; i<this.getTamanyo() && !contiene; i++) {
			if (this.tabla[i].equals(m)) {
				contiene=true;
				eliminaMiembroDePosicion(i);
			}
		}
	}
	
	public void eliminaMiembroDePosicion(int posicion) {
		this.tabla[posicion]=this.tabla[tabla.length-1];
		this.tabla=Arrays.copyOf(tabla, this.getTamanyo()-1);
		/*si hubiera que conservar el mismo orden:
		 for (int i=posicion; i<this.getTamanyo()-1; i++) {
		 	this.tabla[i]=this.tabla[i+1];
		 }*/
	}
}
