/*
 * Dados dos valores numéricos enteros, calcular e informar su producto mediante sumas sucesivas.
 */

package paquete;

import java.util.Scanner;

public class SumasSucesivas {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		num1 = entrada.nextInt();
		
		System.out.print("¿Por cuánto desea multiplicarlo? ");
		num2 = entrada.nextInt();
		
		resultado = num1 * num2;
		
		for(int i = 1; i <= num2; i++){
			if(i == num2){
				System.out.print(num1 + " = " + resultado);
			}else{
			System.out.print(num1 + " + ");
			}
		}
		
	}
}