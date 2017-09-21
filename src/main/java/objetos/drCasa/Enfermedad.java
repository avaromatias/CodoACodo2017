package objetos.drCasa;

public class Enfermedad {

	int celulasAmenazadas;
	
	public int getCelulasAmenazadas() {
		return celulasAmenazadas;
	}

	public void setCelulasAmenazadas(int celulasAmenazadas) {
		this.celulasAmenazadas = celulasAmenazadas;
	}

	public Enfermedad(int cantidadCelulas){
		celulasAmenazadas = cantidadCelulas;
	}

	public void aumentarCelulasAmenazadas(int unaCantidad){
		celulasAmenazadas += unaCantidad;
	}
	
	public void disminuirCelulasAmenazadas(int unaCantidad){
		celulasAmenazadas -= unaCantidad;
	}
	
	public void infectar(Persona unaPersona){
		
	}
	
}
