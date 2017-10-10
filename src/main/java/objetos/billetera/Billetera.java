package objetos.billetera;

public class Billetera {

	double saldo = 15;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void poner(double unaCantidad){
		try {
			this.validarMayorACero(unaCantidad);
			this.saldo += unaCantidad;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sacar(double unaCantidad){
		try {
			this.validarMayorACero(unaCantidad);
			this.validarSaldoSuficiente(unaCantidad);
			this.saldo -= unaCantidad;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void validarMayorACero(double unaCantidad) throws Exception{
		if(unaCantidad <= 0){
			throw new Exception("El monto a ingresar debe ser un valor positivo.");
		}
	}
	
	public void validarSaldoSuficiente(double unaCantidad) throws Exception{
		if(unaCantidad > saldo){
			throw new Exception("No puede sacar mas de $" + saldo);
		}
	}
	
}
