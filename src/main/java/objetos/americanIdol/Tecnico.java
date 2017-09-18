package objetos.americanIdol;

public class Tecnico implements Juez{

	@Override
	public int puntaje(Artista unArtista) {
		switch(unArtista.getCancion().getGenero()){
		case "Folklore":
			if(unArtista.tiene("poncho") && unArtista.tiene("alpargatas")){
				return 10;
			}else{
				return -5;
			}
		case "Tango":
			if(unArtista.tiene("sombrero") && unArtista.getEdad() > 50 && unArtista.isAfino()){
				return 10;
			}else{
				return -5;
			}
		case "Cumbia":
			if(unArtista.isBailaBien()){
				return 10;
			}else{
				return -5;
			}
		case "Pop":
			return 10;
		default:
			return 0;
		}
	}

	
	
}
