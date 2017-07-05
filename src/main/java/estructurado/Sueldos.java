/*
 * Se ingresa un conjunto de valores reales, cada uno de los cuales representan el sueldo de un empleado,
 * excepto el último valor que será 0 para indicar el fin del ingreso de datos.
 * Se pide desarrollar un programa que determine e informe:
 
- Cuántos empleados ganan menos $2000.
- Cuántos ganan $2000 o más pero menos de $3000.
- Cuántos ganan $3000 o más pero menos de $5000.
- Cuántos ganan $5000 o más.

 */

package estructurado;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		
		int contMenores2000 = 0, cont2000y3000 = 0, cont3000y5000 = 0, contMayores5000 = 0;
		float sueldo = 0;
		Scanner entrada = new Scanner(System.in);
		
		do{
		System.out.print("Ingrese sueldo: ");
		sueldo = entrada.nextFloat();
		
		if(sueldo < 2000){
			contMenores2000++;
		}else{
			if(sueldo >= 2000 && sueldo < 3000){
				cont2000y3000++;
			}else{
				if(sueldo >=3000 && sueldo < 5000){
					cont3000y5000++;
				}else{
					if(sueldo >= 5000){
						contMayores5000++;
					}
				}
			}
		}
		
		}while(sueldo != 0);
		
		System.out.println("Ganan menos de 2000: " + (contMenores2000 - 1));
		System.out.println("Ganan entre 2000 y 3000: " + cont2000y3000);
		System.out.println("Ganan entre 3000 y 5000: " + cont3000y5000);
		System.out.println("Ganan mas de 5000: " + contMayores5000);
		
	}

}
