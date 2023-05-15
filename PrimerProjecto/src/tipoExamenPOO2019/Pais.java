package tipoExamenPOO2019;

public class Pais {
	private String nombre; 						// nombre del pais
	private Guerra tablaGuerras[]; 				// guerras en las que ha participado este pais.
	private int nGuerras; 						// numero de elementos en la tabla.
	public static final int MAX_GUERRAS = 10; 	// constante con el maximo de guerras permitido en un pais.

	public Pais(String nombre) {
		this.nombre = nombre;
		this.tablaGuerras = new Guerra[Pais.MAX_GUERRAS];
		this.nGuerras = 0;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public void participoEn(Guerra guerra) {
		this.tablaGuerras[this.nGuerras++] = guerra;

	}
	
	public boolean haSidoAliadoDe(Pais pais) {
		for(int i=0; i<this.nGuerras; i++) {
			if(this.tablaGuerras[i].getBandoA().contienePais(this) &&
			   this.tablaGuerras[i].getBandoA().contienePais(pais) ||
			   this.tablaGuerras[i].getBandoB().contienePais(this) &&
			   this.tablaGuerras[i].getBandoB().contienePais(pais)) {
				  return true;
			}
		}
		return false;
	}

	public Pais[] posiblesEnemigos() {
		Bando bandoFicticio = new Bando("Mentira");
		
		for (int i=0; i<this.nGuerras; i++) {
			if (this.tablaGuerras[i].getBandoA().contienePais(this)) {
				for (int j=0; j<this.tablaGuerras[i].getBandoB().getnPaises(); j++) {
					if (!bandoFicticio.contienePais(this.tablaGuerras[i].getBandoB().getTablaPaises()[j]))
						bandoFicticio.anyadePais(this.tablaGuerras[i].getBandoB().getTablaPaises()[j]);
				}
			}
			else {
				for (int k=0; k<this.tablaGuerras[i].getBandoA().getnPaises(); k++) {
					if (!bandoFicticio.contienePais(this.tablaGuerras[i].getBandoA().getTablaPaises()[k]))
						bandoFicticio.anyadePais(this.tablaGuerras[i].getBandoA().getTablaPaises()[k]);
				}
			}
		}
		
		Pais tEnemigos[] = new Pais[bandoFicticio.getnPaises()];
		
		for (int i=0; i<bandoFicticio.getnPaises(); i++) {
			tEnemigos[i] = bandoFicticio.getTablaPaises()[i];
		}
		
		return tEnemigos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		
		Pais other = (Pais) obj;
		
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		
		return true;
	}
	
	public int getNBatallas() {
		int numBatallas=0;
		
		for (int i=0; i<this.nGuerras; i++) {
			for (int j=0; j<this.tablaGuerras[i].getnBatallas(); j++) {
				if (this.tablaGuerras[i].getTablaBatallas()[j].getPais1().equals(this) ||
					this.tablaGuerras[i].getTablaBatallas()[j].getPais2().equals(this)) {
						numBatallas++;
					}
			}
		}
		return numBatallas;
	}
}