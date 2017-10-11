package objetos.excepcionProfesor;

import java.util.List;

public class Profesor {

	public double cerrarNotas(Alumno unAlumno){
		try{
			this.validarNotas(unAlumno.getNotas());
			return unAlumno.getNotas().stream().reduce(0, (a, b) -> a + b) / unAlumno.getNotas().size();
		}catch (ExcepcionNota e){
			e.printStackTrace();
			return -1;
		}
	}
	
	public void validarNotas(List<Integer> unasNotas) throws ExcepcionNota{
		if(unasNotas.stream().anyMatch(nota -> (nota < 0 || nota > 10))){
			throw new ExcepcionNota("Nota fuera de la escala.");
		}
	}
	
}
