package objetos.losPiratas;

public class CiudadCostera implements Victima{

	int habitantes;
	
	public CiudadCostera(int cantidadHabitantes){
		habitantes = cantidadHabitantes;
	}
	
	public void agregarHabitantes(int cantidadHabitantes){
		habitantes += cantidadHabitantes;
	}
	
	@Override
	public boolean esVulnerable(Barco unBarco) {
		return unBarco.cantidadTripulacion() >= habitantes * 0.4 || unBarco.getTripulacion().stream().allMatch(tripulante -> tripulante.estaPasadoDeRon());
	}

	@Override
	public boolean seAnimaASaquearme(Pirata unPirata) {
		return unPirata.nivelEbriedadMayorA(50);
	}
	
}
