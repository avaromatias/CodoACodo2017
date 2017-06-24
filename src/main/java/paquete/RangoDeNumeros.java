/*
 * Se pide ingresar dos números enteros, hacer que el programa muestre por
 * pantalla todos los números que hay en ese rango de números.
 */

package paquete;

import java.util.Scanner;

public class RangoDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Ingrese un número mayor que el anterior: ");
		num2 = entrada.nextInt();
		
		for(int i = num1; i <= num2; i++){
			if(i == num2){
				System.out.print(i + ".");
			}else{
			System.out.print(i + ", ");
			}
		}
		
	}

}
