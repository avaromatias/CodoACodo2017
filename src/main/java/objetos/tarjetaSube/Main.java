/* Queremos modelar el sistema de la SUBE. Para ello, sabemos que cada
persona puede tener solo una tarjeta.
Las personas pueden cargar su tarjeta y viajar en distintos transportes y
su boleto tiene diferentes precios, como por ejemplo:

Tren $4
Colectivo $ 6,25
Subte $7,5

Claramente al viajar en uno de estos transportes, el saldo de la tarjeta
disminuye, y al cargarle crédito este aumenta.

Modelar Persona, Tarjeta y Transporte con sus respectivos mensajes y
atributos. */

package objetos.tarjetaSube;

public class Main {

	public static void main(String[] args) {
		
		Tarjeta subeDePedro = new Tarjeta();
		Persona pedro = new Persona(subeDePedro);
		Transporte tren = new Transporte(4);
		Transporte colectivo = new Transporte(6.25);
		Transporte subte = new Transporte(7.5);
		
		pedro.cargarTarjeta(100);
		
		System.out.println("El saldo de la tarjeta de Pedro es de: " + subeDePedro.getSaldo());
		
		pedro.viajar(subte);
		
		System.out.println("El saldo de la tarjeta de Pedro despues de viajar en subte es de: " + subeDePedro.getSaldo());
		
		pedro.viajar(tren);
		
		System.out.println("El saldo de la tarjeta de Pedro despues de viajar en tren es de: " + subeDePedro.getSaldo());
		
		pedro.cargarTarjeta(100);
		
		System.out.println("El saldo de la tarjeta de Pedro despues de cargar la tarjeta es de: " + subeDePedro.getSaldo());
		
		pedro.viajar(colectivo);
		
		System.out.println("El saldo de la tarjeta de Pedro despues de viajar en colectivo es de: " + subeDePedro.getSaldo());
	}

}
