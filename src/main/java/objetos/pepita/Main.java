package objetos.pepita;

public class Main {

	public static void main(String[] args) {

		Ave pepita = new Ave();
		Comida arroz = new Comida();
		Comida alpiste = new Comida();
		
		alpiste.setEnergia(10);
		arroz.setEnergia(13);
		
		pepita.darComida(alpiste);
		
		System.out.println("La energia de pepita al momento de crearla es de: " + pepita.getEnergia());
		
		pepita.volar(23);
		
		System.out.println("La energia de pepita despues de volar es de: " + pepita.getEnergia());

		pepita.comer();
		
		System.out.println("La energia de pepita despues de comer es de: " + pepita.getEnergia());
		
	}

}
