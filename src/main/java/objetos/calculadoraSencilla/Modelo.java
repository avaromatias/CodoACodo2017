package objetos.calculadoraSencilla;

public class Modelo {

	public double sumar(String n1, String n2){
		double numero1 = Double.parseDouble(n1);
		double numero2 = Double.parseDouble(n2);
		return numero1 + numero2;
	}
	
}
