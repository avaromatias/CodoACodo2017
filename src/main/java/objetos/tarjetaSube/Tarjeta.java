package objetos.tarjetaSube;

public class Tarjeta {
	
	double saldo = 0;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void cargate(double dinero){
		saldo += dinero;
	}
	
	public void descontate(double dinero){
		saldo -= dinero;
	}
}
