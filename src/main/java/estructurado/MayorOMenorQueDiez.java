/*
 * Dados 5 números enteros ingresados por el usuario, informar el promedio
 * de los mayores o iguales que 10 y la suma de los menores que 10.
 * Para resolver este ejercicio utilizar un ciclo for (Para).
 */

package estructurado;

import java.util.Scanner;

public class MayorOMenorQueDiez {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0, acumMayores = 0, contMayores = 0, acumMenores = 0;
		float prom = 0;
		
		for(int i = 1; i <= 5; i++){
			System.out.print("Ingrese un número: ");
			num = entrada.nextInt();
			
			if(num >= 10){
				acumMayores = acumMayores + num;
				contMayores++;
			}
			else acumMenores = acumMenores + num;
		}
		
		prom = acumMayores / contMayores;
		
		if (contMayores == 0){
			System.out.println("No hay numeros mayores que 10");
		}else System.out.println("El promedio de los mayores es: " + prom);
		System.out.println("La suma de los menores es: " + acumMenores);
		
	}

}
