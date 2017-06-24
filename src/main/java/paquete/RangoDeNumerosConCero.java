/*
 * Se pide ingresar una serie de números. El programa deberá mostrar por
 * pantalla la suma de todos esos números cuando se ingrese el número 0.
 */

package paquete;

import java.util.Scanner;

public class RangoDeNumerosConCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, suma = 0;
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.print("Ingrese un número: ");
			num = entrada.nextInt();
			
			suma += num; //suma = suma + num;
			
		}while(num !=0);
		
		System.out.print("La suma de esos números es: " + suma);
		
	}

}
