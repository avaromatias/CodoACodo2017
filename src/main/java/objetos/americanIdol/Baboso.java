package objetos.americanIdol;

public class Baboso implements Juez{

	@Override
	public int votar(Artista unArtista) {

		if(unArtista.esMujer() && unArtista.esJoven()){
			return 10;
		}else{
			return -5;
		}
	}

	
	
}
