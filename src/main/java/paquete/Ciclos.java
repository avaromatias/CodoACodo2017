package paquete;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		
// ***** PARA PROBAR EL CÓDIGO QUITAR LOS "/*" Y "*/" AL COMIENZO Y AL FINAL DE CADA CICLO (DE A UNO POR VEZ) *****
		
		
		// i = i + 1 == i++
		
		//(Pseint: Para)
			
			for(int i = 1; i<=10; i++){
			
			if (i == 2){
				System.out.println("Hola");
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Chau");
		
		
		/*(Pseint: Mientras)
 		
		int i = 2;
		
		System.out.print("1");
		
		while(i<=10){
			System.out.print(", " + i);
			i++;
		}
		*/
		
		/*(Pseint: Repetir)
 		
		int i = 2;
		
		System.out.print("1");
		
		do{
			System.out.print(", " + i);
			i++;
		}while(i<=10)
		*/
		
		/*(Pseint: Segun)
		
		int mes;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un mes:");
		mes = entrada.nextInt();
		
		switch(mes){
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Mes inválido.");
			break;
		}
		*/
	}

	
}
