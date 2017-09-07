package objetos.ejercicioIntegrador;

public class Main {

	public static void main(String[] args) {
		
		Heroe shrek = new Heroe();
		LiberarDoncella liberarAFiona = new LiberarDoncella("Liberar a Fiona", 5, "Lord Farquad");
		BuscarItemMagico buscarPiedraFilosofal = new BuscarItemMagico("Buscar piedra filosofal", 40, "Albus Dumbledore");

		shrek.agregarMision(liberarAFiona);
		shrek.agregarMision(buscarPiedraFilosofal);
		
		System.out.print("Cantidad de misiones: ");
		System.out.println(shrek.cantidadDeMisiones());
		System.out.print("Misiones dificiles: ");
		System.out.println(shrek.nombreDeMision(shrek.misionesDificiles()));
		System.out.print("Solicitantes de misiones: ");
		System.out.println(shrek.solicitantesDeMisiones());
		System.out.print("Total puntos de recompensa: ");
		System.out.println(shrek.totalPuntosRecompensa());
		System.out.print("Misiones: ");
		System.out.println(shrek.nombreDeMision(shrek.getMisiones()));
		
	}

}
