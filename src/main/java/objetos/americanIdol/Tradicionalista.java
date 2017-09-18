package objetos.americanIdol;

public class Tradicionalista implements Juez{

	@Override
	public int puntaje(Artista unArtista) {
		if(unArtista.getCancion().esPropiaDelPais()){
			return 10;
		}else{
			return -5;
		}
	}

}
