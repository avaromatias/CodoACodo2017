package objetos.ejercicioIntegrador;

public class BuscarItemMagico implements Mision{

	String nombre;
	int distancia;
	String solicitante;
	
	public BuscarItemMagico(String unNombre, int unaDistancia, String unSolicitante){
		nombre = unNombre;
		distancia = unaDistancia;
		solicitante = unSolicitante;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public boolean esDificil() {
		return distancia > 100;
	}
	
	public int puntosRecompensa(){
		if(distancia > 50){
			return 10;
		}else{
			return 5;
		}
	}

}
