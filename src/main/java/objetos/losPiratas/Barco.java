package objetos.losPiratas;

import java.util.HashSet;
import java.util.Set;

public class Barco {

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
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	private boolean puedeFormarParte(Pirata unPirata) {
		return false;
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
	
}
