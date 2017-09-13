package objetos.americanIdol;

public class Tecnico implements Juez{

	@Override
	public int votar(Artista unArtista) {
		switch(unArtista.getCancion().getGenero()){
		case "folklore":
			if(unArtista.tiene("poncho") && unArtista.tiene("alpargatas")){
				return 10;
			}else{
				return -5;
			}
		case "tango":
			if(unArtista.tiene("sombrero") && unArtista.getEdad() > 50 && unArtista.isAfino()){
				return 10;
			}else{
				return -5;
			}
		case "cumbia":
			if(unArtista.isBailaBien()){
				return 10;
			}else{
				return -5;
			}
		case "pop":
			return 10;
		default:
			return 0;
		}
	}

	
	
}
