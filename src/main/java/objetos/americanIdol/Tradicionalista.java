package objetos.americanIdol;

public class Tradicionalista implements Juez{

	@Override
	public int votar(Artista unArtista) {
		if(unArtista.getCancion().esPropiaDelPais()){
			return 10;
		}else{
			return -5;
		}
	}

}
