package objetos.losPiratas;

public class BusquedaDelTesoro implements Mision{

	@Override
	public boolean esUtil(Pirata unPirata) {
		return (unPirata.tieneItemsBusquedaDelTesoro() && unPirata.tieneMenosMonedasQue(5));
	}

	@Override
	public boolean cumpleRequisito(Barco unBarco) {
		return (unBarco.tieneSuficienteTripulacion() && unBarco.alguienTiene("Llave de cofre"));
	}

}
