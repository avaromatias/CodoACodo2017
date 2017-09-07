package objetos.ejercicioIntegrador;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Heroe {

	Set<Mision> misiones = new HashSet<Mision>();
	
	public void agregarMision(Mision unaMision){
		misiones.add(unaMision);
	}
	
	public int cantidadDeMisiones(){
		return misiones.size();
	}
	
	public Set<Mision> misionesDificiles(){
		return misiones.stream().filter(mision -> mision.esDificil()).collect(Collectors.toSet());
	}
	
	public Set<String> solicitantesDeMisiones(){
		return misiones.stream().map(mision -> mision.getSolicitante()).collect(Collectors.toSet());
	}
	
	public int totalPuntosRecompensa(){
		return misiones.stream().map(mision -> mision.puntosRecompensa()).reduce(0, (a,b) -> a + b);
	}
	
	public Set<String> nombreDeMision(Set<Mision> unasMisiones){
		return unasMisiones.stream().map(mision -> mision.getNombre()).collect(Collectors.toSet());
	}

	public Set<Mision> getMisiones() {
		return misiones;
	}

	public void setMisiones(Set<Mision> misiones) {
		this.misiones = misiones;
	}
	
}
