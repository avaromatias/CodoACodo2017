package objetos.excepcionProfesor;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ProfesorTest {

	Alumno leandro = new Alumno(Arrays.asList(2, 3, 11));
	Alumno pedro = new Alumno(Arrays.asList(10, 8, 9));
	Alumno marisol = new Alumno(Arrays.asList(6, 7, 8));
	Profesor mati = new Profesor();
	
	@Test
	public void promedioDeLeandroEs3() {
		assertEquals(3, mati.cerrarNotas(leandro), 0);
	}
	
	@Test
	public void promedioDePedroEs9() {
		assertEquals(9, mati.cerrarNotas(pedro), 0);
	}
	
	@Test
	public void promedioDeMarisolEs7() {
		assertEquals(7, mati.cerrarNotas(marisol), 0);
	}
	

}
