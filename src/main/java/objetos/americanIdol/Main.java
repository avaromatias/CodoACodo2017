package objetos.americanIdol;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cancion losEjesDeMiCarreta = new Cancion("Atahualpa Yupanqui", "Folklore");
		Cancion porUnaCabeza = new Cancion("Carlos Gardel", "Tango");
		Cancion losDueniosDelPabellon = new Cancion("Damas Gratis", "Cumbia");
		Cancion thriller = new Cancion("Michael Jackson", "Pop");
		
		List<String> indumentariaDelFanDeWanda = Arrays.asList("Campera de cuero", "Lentes de sol");
		List<String> indumentariaDeKarina = Arrays.asList("Remera nike", "Zapatillas piola");
		List<String> indumentariaDelPepo = Arrays.asList("Saco", "Zapatos", "Sombrero");
		
		Artista fanDeWanda = new Artista("Fan de Wanda", 28, "Hombre", indumentariaDelFanDeWanda, false, false, thriller);
		Artista karina = new Artista("Karina", 29, "Mujer", indumentariaDeKarina, true, false, losDueniosDelPabellon);
		Artista elPepo = new Artista("El pepo", 32, "Hombre", indumentariaDelPepo, false, false, porUnaCabeza);
		
		Tradicionalista patriciaSosa = new Tradicionalista();	//-5
		Baboso marceloPolino = new Baboso();					//-5
		Tecnico valeriaLynch = new Tecnico();					//10
		Espectador roque = new Espectador();					//2
		Espectador mara = new Espectador(valeriaLynch);			//2
		
		Presentador tinelli = new Presentador();
		tinelli.agregarArtista(elPepo);
		tinelli.agregarArtista(karina);
		tinelli.agregarArtista(fanDeWanda);
		tinelli.asignarJuez(mara);
		tinelli.asignarJuez(roque);
		tinelli.asignarJuez(valeriaLynch);
		tinelli.asignarJuez(marceloPolino);
		tinelli.asignarJuez(patriciaSosa);
		
		System.out.println(tinelli.nombresArtistas(tinelli.puestos()));
		System.out.println(tinelli.puntajesArtistas(tinelli.puestos()));
		System.out.println(tinelli.todosVotanA(fanDeWanda));
		//System.out.println(mara.puntaje(fanDeWanda));
		
	}

}
