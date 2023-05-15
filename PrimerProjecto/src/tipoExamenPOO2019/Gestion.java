package tipoExamenPOO2019;

public class Gestion {
	private static Guerra tablaGuerras[];
	private static int nGuerras;

	public static void main(String args[])
	{
   
		// Datos de ejemplo para poder hacer pruebas
		// Creacion de varios paises.
		
		Pais francia = new Pais("Francia");
		Pais reinoUnido = new Pais("Reino Unido");
		Pais rusia = new Pais("Rusia");
		Pais usa = new Pais("Estados Unidos");
		Pais austria = new Pais("Austria");
		Pais hungria = new Pais("Hungria");
		Pais turquia = new Pais ("Turquia");
		Pais alemania = new Pais("Alemania");
		Pais japon = new Pais("Japon");
		Pais italia = new Pais("Italia");
		Pais polonia = new Pais("Polonia");
		
		// Creacion de Bandos para las distintas guerras
		
		Bando aliados1 = new Bando("Aliados I");
		Bando centroeuropeo = new Bando("Centro Europeo");
		Bando aliados2 = new Bando("Aliados II");
		Bando eje = new Bando ("Eje Berlin-Roma-Tokio");
		
		// Añadimos a cada bando de las guerras los paises que lo componian
		
		aliados1.anyadePais(francia);
		aliados1.anyadePais(reinoUnido);
		aliados1.anyadePais(usa);
		aliados1.anyadePais(rusia);
		
		centroeuropeo.anyadePais(austria);
		centroeuropeo.anyadePais(hungria);
		centroeuropeo.anyadePais(turquia);
		centroeuropeo.anyadePais(alemania);

		aliados2.anyadePais(francia);
		aliados2.anyadePais(polonia);
		aliados2.anyadePais(reinoUnido);
		aliados2.anyadePais(usa);
		aliados2.anyadePais(rusia);
		
		eje.anyadePais(alemania);
		eje.anyadePais(italia);
		eje.anyadePais(japon);
		
		// creamos varias batallas
		
		Batalla tannenberg = new Batalla("Tannenberg", rusia, alemania);
		Batalla verdin = new Batalla("Verdin", francia, alemania);
		Batalla gallipoli = new Batalla("Gallipoli", francia, turquia);
		Batalla elAlamein = new Batalla("El Alamein", reinoUnido, alemania);
		Batalla midway = new Batalla("Midway", usa, japon);
		Batalla stalingrado = new Batalla("Stalingrado", alemania, rusia);
		Batalla normandia = new Batalla("Normandia", usa, alemania);
		
		// creamos dos guerras, con sus respectivos bandos
		
		Guerra mundialI = new Guerra("Primera guerra mundial", aliados1, centroeuropeo);
		Guerra mundialII = new Guerra("Segunda guerra mundial", eje, aliados2);
		
		// colocamos las batallas en las guerras correspondientes
		
		mundialI.anyadeBatalla(tannenberg);
		mundialI.anyadeBatalla(verdin);
		mundialI.anyadeBatalla(gallipoli);
		
		mundialII.anyadeBatalla(elAlamein);
		mundialII.anyadeBatalla(midway);
		mundialII.anyadeBatalla(stalingrado);
		mundialII.anyadeBatalla(normandia);
		
		// hacemos que cada pais sepa en que guerras ha participado
		
		francia.participoEn(mundialI);
		reinoUnido.participoEn(mundialI);
		rusia.participoEn(mundialI);
		usa.participoEn(mundialI);
		austria.participoEn(mundialI);
		hungria.participoEn(mundialI);
		turquia.participoEn(mundialI);
		alemania.participoEn(mundialI);
		
		japon.participoEn(mundialII);
		italia.participoEn(mundialII);
		alemania.participoEn(mundialII);
		polonia.participoEn(mundialII);
		francia.participoEn(mundialII);
		reinoUnido.participoEn(mundialII);
		rusia.participoEn(mundialII);
		usa.participoEn(mundialII);
		
		// por ultimo colocamos las guerras en la tabla de Guerras de la gestion
		
		tablaGuerras = new Guerra[10];
		nGuerras = 0;
		
		tablaGuerras[nGuerras++] = mundialI;
		tablaGuerras[nGuerras++] = mundialII;
		
		// mostramos los datos almacenados
		
		mostrarTablaGuerras();
		
		System.out.println("El mas beligerante: " + masBeligerante());
		System.out.println("El que tiene mayor conflagracion: " + mayorConflagracion());
		
		if (mundialI.compareTo(mundialII) < 0) {
			System.out.println("La guerra mundial I es menos que la II.");
		} else if (mundialI.compareTo(mundialII) == 0) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("La guerra mundial I es mayor que la II.");
		}
	
	}

	private static void mostrarTablaGuerras() {
		for (int i = 0; i < nGuerras; i++) {
			System.out.println(tablaGuerras[i]);
		}
	}
	
	private static Guerra mayorConflagracion() {
		Guerra max = tablaGuerras[0];
		
		for (int i=1; i<nGuerras; i++) {
			if (tablaGuerras[i].compareTo(max) > 0) {
				max = tablaGuerras[i];
			}
		}
		return max;
	}
	
	public static Pais masBeligerante() {
		Pais max = tablaGuerras[0].getBandoA().getTablaPaises()[0];
		
		for (int i=1; i<nGuerras; i++) {
			for (int j=0; j<tablaGuerras[i].getBandoA().getnPaises(); j++) {
				if (tablaGuerras[i].getBandoA().getTablaPaises()[j].getNBatallas() >
				max.getNBatallas()) {
					max = tablaGuerras[i].getBandoA().getTablaPaises()[j];
				}
			}
			
			for (int k=0; k<tablaGuerras[i].getBandoB().getnPaises(); k++) {
				if (tablaGuerras[i].getBandoB().getTablaPaises()[k].getNBatallas() >
				max.getNBatallas()) {
					max = tablaGuerras[i].getBandoB().getTablaPaises()[k];
				}
			}
		}
		
		return max;
	}
}