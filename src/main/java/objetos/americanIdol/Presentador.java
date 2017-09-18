package objetos.americanIdol;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Presentador {

	Set<Artista> artistas = new HashSet<Artista>();
	Set<Juez> jueces = new HashSet<Juez>();

	public Set<Juez> getJueces() {
		return jueces;
	}

	public void setJueces(Set<Juez> jueces) {
		this.jueces = jueces;
	}

	public Set<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(Set<Artista> artistas) {
		this.artistas = artistas;
	}
	
	public void agregarArtista(Artista unArtista){
		artistas.add(unArtista);
	}
	
	public void asignarJuez(Juez unJuez){
		jueces.add(unJuez);
	}
	
	public Artista ganador(){
		return this.puestos().get(this.puestos().size() - 1);
	}
	
	public int todosVotanA(Artista unArtista){
		return jueces.stream().map(juez -> juez.puntaje(unArtista)).reduce(0, (a,b) -> a + b);
	}
	
	public List<Artista> puestos(){
		return artistas.stream().sorted( (artista1, artista2) -> Integer.compare(this.todosVotanA(artista1), this.todosVotanA(artista2))).collect(Collectors.toList());
	}
	
	public List<String> nombresArtistas(List<Artista> artists){
		return artists.stream().map(artist -> artist.getNombre()).collect(Collectors.toList());
	}
	
	public List<Integer> puntajesArtistas(List<Artista> artists){
		return artists.stream().map(artist -> this.todosVotanA(artist)).collect(Collectors.toList());
	}
	
}
