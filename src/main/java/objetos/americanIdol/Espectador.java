package objetos.americanIdol;

public class Espectador implements Juez{

	Juez seIdentificaCon;
	
	public Espectador(Juez unJuez){
		seIdentificaCon = unJuez;
	}
	
	public Espectador(){
		
	}
	
	@Override
	public int puntaje(Artista unArtista) {
		
		if(seIdentificaCon != null){
			if(this.getSeIdentificaCon().puntaje(unArtista) == 10){
				return 2;
			}else{
				return -1;
			}
		}else{
			return 2;
		}
		
	}

	public Juez getSeIdentificaCon() {
		return seIdentificaCon;
	}

	public void setSeIdentificaCon(Juez seIdentificaCon) {
		this.seIdentificaCon = seIdentificaCon;
	}

}
