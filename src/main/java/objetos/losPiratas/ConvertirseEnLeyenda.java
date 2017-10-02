package objetos.losPiratas;

public class ConvertirseEnLeyenda implements Mision{

	String itemObligatorio;
	
	@Override
	public boolean esUtil(Pirata unPirata) {
		return unPirata.tieneMasItemsQue(10) && unPirata.tiene(itemObligatorio);
	}

	@Override
	public boolean cumpleRequisito(Barco unBarco) {
		return unBarco.tieneSuficienteTripulacion();
	}
	
}
