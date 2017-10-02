package objetos.losPiratas;

public class Saqueo implements Mision{

	@Override
	public boolean esUtil(Pirata unPirata) {
		return false;
	}

	@Override
	public boolean cumpleRequisito(Barco unBarco) {
		return unBarco.tieneSuficienteTripulacion();
	}
	
}
