/* Queremos modelar un sistema de nutrición, donde hay personas y comida.

Cada persona puede comer determinada comida y a su vez, cada una de estas
comidas tiene un número de calorías. Estas calorías impactan de diferente
forma en las personas que las ingieran.
Las comidas a su vez, pueden ser saludables, o no.

Si son saludables, la persona que lo ingiera, va a aumentar de peso
en 0,002 * calorias de ese alimento.
Si no son saludables, va a aumentar de peso en 0,005 * calorias de ese alimento.

A su vez, las personas pueden bajar de peso corriendo. En base a la cantidad de kilómetros
que recorran, perderán 0,001 kilos por cada kilómetro recorrido. */

package objetos.nutricion;

public class Main {

	public static void main(String[] args) {
		
		Persona leandro = new Persona();
		Comida churrasco = new Comida();
		Comida banana = new Comida();
		
		leandro.setPeso(69);
		churrasco.setSaludable(false);
		banana.setSaludable(true);
		churrasco.setCalorias(143.5);
		banana.setCalorias(89.6);
		
		System.out.println("Leandro pesa: " + leandro.getPeso());
		
		leandro.comer(banana);
		
		System.out.println("Leandro despues de comerse la banana pesa: " + leandro.getPeso());
		
		leandro.comer(churrasco);
		
		System.out.println("Leandro despues de comerse el churrasco pesa: " + leandro.getPeso());
		
		leandro.correr(10);
		
		System.out.println("Leandro despues de correr pesa: " + leandro.getPeso());

	}

}
