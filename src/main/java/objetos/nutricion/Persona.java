package objetos.nutricion;

public class Persona {

	double peso;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comer(Comida unaComida){
		if(unaComida.isSaludable()){
			this.peso += 0.002 * unaComida.getCalorias();
		} else {
			this.peso += 0.005 * unaComida.getCalorias();
		}
	}
	
	public void correr(double unosKilometros){
		this.peso -= 0.001 * unosKilometros;
	}
	
}
