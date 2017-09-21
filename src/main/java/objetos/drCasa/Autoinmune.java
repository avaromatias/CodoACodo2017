package objetos.drCasa;

public class Autoinmune extends Enfermedad{

	int diasDeInfeccion = 0;
	
	public Autoinmune(int cantidadCelulas) {
		super(cantidadCelulas);
	}

	public void infectar(Persona unaPersona){
		unaPersona.disminuirCelulas(this.celulasAmenazadas);
		diasDeInfeccion += 1;
	}
	
	public boolean esAgresivaCon(Persona unaPersona){
		return diasDeInfeccion > 30;
	}
	
}
