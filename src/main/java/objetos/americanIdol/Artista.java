package objetos.americanIdol;

import java.util.LinkedList;
import java.util.List;

public class Artista {

	String nombre, sexo;
	int edad;
	List<String> indumentaria = new LinkedList<String>();
	boolean bailaBien, afino;
	Cancion cancion;
	
	public Artista(String unNombre, int unaEdad, String unSexo, List<String> unaIndumentaria, boolean unBaile, boolean unaAfinada, Cancion unaCancion){
		nombre = unNombre;
		edad = unaEdad;
		sexo = unSexo;
		indumentaria = unaIndumentaria;
		bailaBien = unBaile;
		afino = unaAfinada;
		cancion = unaCancion;
	}

	public boolean esMujer() {
		return sexo == "Mujer";
	}

	public boolean esJoven() {
		return edad >= 18 && edad <= 30;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<String> getIndumentaria() {
		return indumentaria;
	}

	public void setIndumentaria(List<String> indumentaria) {
		this.indumentaria = indumentaria;
	}

	public boolean isBailaBien() {
		return bailaBien;
	}

	public void setBailaBien(boolean bailaBien) {
		this.bailaBien = bailaBien;
	}

	public boolean isAfino() {
		return afino;
	}

	public void setAfino(boolean afino) {
		this.afino = afino;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}
	
	public boolean tiene(String unaVestimenta){
		return indumentaria.contains(unaVestimenta);
	}
	
}
