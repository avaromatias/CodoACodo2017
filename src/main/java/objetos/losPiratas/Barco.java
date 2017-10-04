package objetos.losPiratas;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Barco implements Victima{

	Set<Pirata> tripulacion = new HashSet<Pirata>();
	Mision mision;
	int capacidad;
	
	public Barco(Mision unaMision, int unaCapacidad){
		mision = unaMision;
		capacidad = unaCapacidad;
	}
	
	public void incorporar(Pirata unPirata){
		if(this.puedeFormarParte(unPirata)){
			tripulacion.add(unPirata);
		}
	}

	public Set<Pirata> getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Set<Pirata> tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Mision getMision() {
		return mision;
	}

	public void cambiarMision(Mision mision) {
		this.mision = mision;
		this.echarInutiles();
	}
	
	public void echarInutiles(){
		//this.setTripulacion(this.tripulantesUtiles());
		tripulacion.retainAll(this.tripulantesUtiles());
	}
	
	public Set<Pirata> tripulantesUtiles(){
		return tripulacion.stream().filter(tripulante -> mision.esUtil(tripulante)).collect(Collectors.toSet());
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public boolean esTemible(){
		return puedeRealizar(mision);
	}

	private boolean puedeRealizar(Mision unaMision) {
		return false;
	}

	public boolean tieneSuficienteTripulacion() {
		return this.cantidadTripulacion() >= capacidad * 0.9;
	}
	
	public int cantidadTripulacion(){
		return tripulacion.size();
	}
	
	public boolean alguienTiene(String unItem){
		return tripulacion.stream().anyMatch(tripulante -> tripulante.tiene(unItem));
	}

	@Override
	public boolean esVulnerable(Barco unBarco) {
		return this.cantidadTripulacion() < unBarco.cantidadTripulacion() / 2;
	}

	@Override
	public boolean seAnimaASaquearme(Pirata unPirata) {
		return unPirata.estaPasadoDeRon();
	}
	
	public boolean tieneLugarParaUnoMas(){
		return this.cantidadTripulacion() < capacidad;
	}
	
	public boolean puedeFormarParte(Pirata unPirata){
		return this.tieneLugarParaUnoMas() && mision.esUtil(unPirata);
	}
	
	public List<Pirata> ordenSegunEbriedad(){
		return tripulacion.stream().sorted((pirata1, pirata2) -> Integer.compare(pirata1.getNivelEbriedad(), pirata2.getNivelEbriedad())).collect(Collectors.toList());
	}
	
	public Pirata pirataMasEbrio(){
		return this.ordenSegunEbriedad().get(this.ordenSegunEbriedad().size() - 1);
	}
	
}
