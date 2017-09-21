package objetos.drCasa;

public class Infecciosa extends Enfermedad{

	public Infecciosa(int cantidadCelulas) {
		super(cantidadCelulas);
	}

	public void infectar(Persona unaPersona){
		unaPersona.aumentarTemperatura(this.celulasAmenazadas * 0.001);
	}
	
	public void reproducite(){
		celulasAmenazadas *= 2;
	}
	
	public boolean esAgresivaCon(Persona unaPersona){
		return (this.getCelulasAmenazadas() > unaPersona.getCelulas() * 0.1);
	}
	
}
