package objetos.notebooksCodoACodo;

public class Main {

	public static void main(String[] args) {
		
		Alumno ramiro = new Alumno();
		Alumno leandro = new Alumno();
		Alumno rodrigo = new Alumno();
		
		Notebook dellLeandro = new Notebook();
		Notebook dell14 = new Notebook();
		Notebook samsung = new Notebook();
		
		dellLeandro.setNombre("Dell de leandro");
		dell14.setNombre("Dell de rodrigo");
		samsung.setNombre("compu de ramiro");
		
		ramiro.asignarComputadora(samsung);
		leandro.asignarComputadora(dellLeandro);
		rodrigo.asignarComputadora(dell14);
		
		System.out.println("La computadora de ramiro es: " + ramiro.getComputadoraAsignada());
		System.out.println("La computadora de leandro es: " + leandro.getComputadoraAsignada());
	//	System.out.println("La computadora de rodrigo es: " + rodrigo.getComputadoraAsignada().getNombre());

	}

}
