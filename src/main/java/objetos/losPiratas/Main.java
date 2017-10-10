package objetos.losPiratas;

public class Main {

	public static void main(String[] args) {

		Pirata barbaNegra = new Pirata(5);
		
		barbaNegra.gastarMonedas(1);
		System.out.println(barbaNegra.getMonedas());

	}

}
