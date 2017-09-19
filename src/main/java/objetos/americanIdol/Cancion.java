package objetos.americanIdol;

public class Cancion {
	
	String autor, genero;
	
	public Cancion(String unAutor, String unGenero){
		this.autor = unAutor;
		this.genero = unGenero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean esPropiaDelPais(){
		return (genero == "Folklore" || genero == "Tango");
	}
}
