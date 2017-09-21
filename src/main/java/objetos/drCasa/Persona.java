package objetos.drCasa;

import java.util.HashSet;
import java.util.Set;

public class Persona {

	Set<Enfermedad> enfermedades = new HashSet<Enfermedad>();
	double temperatura = 36;
	int celulas, celulasAmenazadas;
	
	public Persona(int unasCelulas){
		celulas = unasCelulas;
	}
	
	public void disminuirCelulas(int unaCantidad){
		celulas -= unaCantidad;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public int getCelulas() {
		return celulas;
	}

	public void setCelulas(int celulas) {
		this.celulas = celulas;
	}

	public int getCelulasAmenazadas() {
		return celulasAmenazadas;
	}

	public void setCelulasAmenazadas(int celulasAmenazadas) {
		this.celulasAmenazadas = celulasAmenazadas;
	}

	public Set<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(Set<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	public void contraerEnfermedad(Enfermedad unaEnfermedad){
		enfermedades.add(unaEnfermedad);
	}
	
	public void vivir(){
		enfermedades.forEach(enfermedad -> enfermedad.infectar(this));
	}
	
	public void aumentarTemperatura(double unosGrados){
		temperatura += Math.min(temperatura + unosGrados, 45);
	}
	
	public boolean estaEnComa(){
		return temperatura >= 45;
	}
	
}
