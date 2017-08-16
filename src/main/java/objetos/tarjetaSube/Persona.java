package objetos.tarjetaSube;

public class Persona {

	Tarjeta tarjetaAsociada;

	public Tarjeta getTarjetaAsociada() {
		return tarjetaAsociada;
	}

	public void asignarTarjeta(Tarjeta tarjetaAsociada) {
		this.tarjetaAsociada = tarjetaAsociada;
	}
	
	public void viajar(Transporte unTransporte){
		tarjetaAsociada.descontate(unTransporte.getValorBoleto());
	}
	
	public void cargarTarjeta(double dinero){
		tarjetaAsociada.cargate(dinero);
	}
	
}
