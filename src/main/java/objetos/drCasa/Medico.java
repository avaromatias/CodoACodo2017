package objetos.drCasa;

public class Medico extends Persona{

	int dosis;
	
	public Medico(int unasCelulas, int unaDosis) {
		super(unasCelulas);
		dosis = unaDosis;
	}
	
	public void atender(Persona unaPersona){
		unaPersona.getEnfermedades().forEach(enfermedad -> enfermedad.disminuirCelulasAmenazadas(dosis * 15));
		unaPersona.curar(unaPersona.enfermedadesSinCelulasAmenazadas());
	}
	
}
