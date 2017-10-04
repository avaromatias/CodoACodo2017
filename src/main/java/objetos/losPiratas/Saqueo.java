package objetos.losPiratas;

public class Saqueo implements Mision{

	int cantidadMonedas = 20;
	Victima victima;
	
	@Override
	public boolean esUtil(Pirata unPirata) {
		return unPirata.tieneMenosMonedasQue(cantidadMonedas) && unPirata.seAnimaASaquear(victima);
	}

	@Override
	public boolean cumpleRequisito(Barco unBarco) {
		return unBarco.tieneSuficienteTripulacion();
	}
	
}
