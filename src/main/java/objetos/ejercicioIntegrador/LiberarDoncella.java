package objetos.ejercicioIntegrador;

public class LiberarDoncella implements Mision{

	String nombre;
	int cantidadTrolls;
	String solicitante;
	
	public LiberarDoncella(String unNombre, int unaCantidad, String unSolicitante){
		nombre = unNombre;
		cantidadTrolls = unaCantidad;
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

	public boolean esDificil() {
		return cantidadTrolls >= 4 && cantidadTrolls <= 5;
	}

	public int getCantidadTrolls() {
		return cantidadTrolls;
	}

	public void setCantidadTrolls(int cantidadTrolls) {
		this.cantidadTrolls = cantidadTrolls;
	}
	
	public int puntosRecompensa(){
		return 2 * cantidadTrolls;
	}

}
