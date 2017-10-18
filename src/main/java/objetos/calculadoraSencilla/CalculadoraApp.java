package objetos.calculadoraSencilla;

public class CalculadoraApp {

	public static void main(String[] args) {

		Vista entornoGrafico = new Vista();
		Modelo logica = new Modelo();
		Controlador interaccion = new Controlador(entornoGrafico, logica);
		

	}

}
