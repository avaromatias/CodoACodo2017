package objetos.americanIdol;

public class Baboso implements Juez{

	@Override
	public int puntaje(Artista unArtista) {

		if(unArtista.esMujer() && unArtista.esJoven()){
			return 10;
		}else{
			return -5;
		}
	}

	
	
}
