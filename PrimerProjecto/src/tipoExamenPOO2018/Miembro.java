package tipoExamenPOO2018;

public class Miembro {
	private String email;
	private String nombre;
	private ListaMiembros amigos;

	public Miembro(String email, String nombre) {
		this.email=email;
		this.nombre=nombre;
		this.amigos=new ListaMiembros();
	}

	public ListaMiembros getAmigos() {
		return amigos;
	}

	public String toString() {
		return this.email+" - "+this.nombre;
	}

	public void anyadeAmigo(Miembro b) {
		this.amigos.anyadeMiembroSinRepetir(b);
	}

	public boolean tieneComoAmigoA(Miembro otro) {
		return this.amigos.contieneMiembro(otro);
	}

	public void eliminaAmigo(Miembro m) {
		this.amigos.eliminaMiembro(m);
	}

	/*devuelve lista de amigos de amigos siempre que no esten en this.amigos*/
	public ListaMiembros personasQueQuizasConozca() {
		/*f, b, c*/
		ListaMiembros personasQuizasAmigos=new ListaMiembros();
		for (int i=0; i<this.amigos.getTamanyo(); i++) {
			ListaMiembros amigosDeAmigo=this.amigos.getTabla()[i].amigos;
			for (int j=0; j<amigosDeAmigo.getTamanyo(); j++) {
				if (!this.tieneComoAmigoA(amigosDeAmigo.getTabla()[j]) && !this.equals(amigosDeAmigo.getTabla()[j])) {
					personasQuizasAmigos.anyadeMiembroSinRepetir(amigosDeAmigo.getTabla()[j]);
				}
			}
		}
		return personasQuizasAmigos;
	}

	public ListaMiembros amigosEnComun(Miembro b) {
		ListaMiembros amigosEnComun=new ListaMiembros();
		for (int i=0; i<b.amigos.getTamanyo(); i++) {
			Miembro amigoDeB=b.amigos.getTabla()[i];
			if (this.tieneComoAmigoA(amigoDeB)) {
				amigosEnComun.anyadeMiembro(amigoDeB);
			}
		}
		return amigosEnComun;
	}

	public boolean tieneLosMismosAmigosQue(Miembro b) {
		/*como estamos guardando los amigos sin repetir en la lista de
		 miembros, si el tamaño de la lista de amigos de uno es igual
		 al tamaño de los amigos en comun, y a su vez este tamaño es
		 igual al tamaño de la lista de amigos de b, entonces tienen
		 los mismos amigos.*/
		return this.amigos.getTamanyo()==this.amigosEnComun(b).getTamanyo() &&
			   this.amigos.getTamanyo()==b.amigos.getTamanyo();
	}

	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((email==null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		Miembro other=(Miembro) obj;
		if (email==null) {
			if (other.email!=null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
