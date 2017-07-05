/*
 * Dados n valores numéricos, informar el mayor y el menor.
 */

package estructurado;

import java.util.Scanner;

public class MayorYMenor {

	public static void main(String[] args) {
		
		int cant = 0, numero = 0, mayor = 0, menor = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cuantos numeros desea ingresar: ");
		cant = entrada.nextInt();
		
		for(int i = 1; i <= cant; i++){
			System.out.print("Ingrese un numero: ");
			numero = entrada.nextInt();
			
			if(i == 1){
				mayor = numero;
				menor = numero;
			}else{
				if(numero > mayor){
					mayor = numero;
				}else{
					if(numero < menor){
						menor = numero;
					}
				}
			}
			
		}
		
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);

	}

}
