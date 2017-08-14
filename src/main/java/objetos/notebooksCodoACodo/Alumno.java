package objetos.notebooksCodoACodo;

public class Alumno {

	Notebook computadoraAsignada;

	public Notebook getComputadoraAsignada() {
		return computadoraAsignada;
	}

	public void asignarComputadora(Notebook unaNotebook) {
		this.computadoraAsignada = unaNotebook;
	}
	
}
