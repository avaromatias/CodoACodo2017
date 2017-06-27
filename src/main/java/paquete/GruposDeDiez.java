/* Mostrar por pantalla los números entre 1 y 100 en grupos de 10, solicitando al usuario si quiere o no continuar
 * visualizando el siguiente grupo de números. */

package paquete;

import java.util.Scanner;

public class GruposDeDiez {

	public static void main(String[] args) {
		
		String respuesta;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 100; i++){
			if(i % 10 != 0){
			System.out.print(i + ", ");
			}else{
				if(i % 10 == 0){
					System.out.println(i + ".");
					System.out.print("¿Desea seguir viendo números? ");
					respuesta = entrada.next().toLowerCase();
					if(respuesta.equals("si")){
						continue;
					}else i = 101;
				}
			}
		}
	}

}