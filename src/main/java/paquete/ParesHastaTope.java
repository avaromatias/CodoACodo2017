/* Mostrar los números pares que hay desde el número 1 hasta N (N es un tope definido por el usuario). Recuerden que existe el operador "%" que lo que hace es decirnos el resto de la división entre dos números. Ejemplos:  7 % 3 = 1  ;  10 % 5 = 0  ;  etc. */

package paquete;

import java.util.Scanner;

public class ParesHastaTope {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int tope = 0;
		
		System.out.print("Ingrese un tope: ");
		tope = entrada.nextInt();
		
		for(int i = 1; i <= tope; i++){
			if(i % 2 == 0){
				if(i == tope || i == tope - 1){
					System.out.print(i + ".");
				}else System.out.print(i + ", ");
			}
		}

	}

}
