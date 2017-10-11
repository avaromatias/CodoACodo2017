package objetos.excepcionProfesor;

import java.util.LinkedList;
import java.util.List;

public class Alumno {

	List<Integer> notas = new LinkedList<Integer>();
	
	public Alumno(List<Integer> unasNotas){
		notas = unasNotas;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}
	
}
