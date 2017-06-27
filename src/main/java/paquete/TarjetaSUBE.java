package paquete;

import java.util.Scanner;

public class TarjetaSUBE {

	static float dinero = 0;
	static int transporte = 0;
	static Scanner entrada = new Scanner(System.in);
	
	public static float elegirTransporte(int unTransporte){
		
		if(unTransporte == 1){
			return 6;
		}else{
			if(unTransporte == 2){
				return 7.5F;
			}else{
				if(unTransporte == 3){
					return 5;
				}else{
					return -1;
				}
			}
		}
	}
	
	public static void cargarCredito(float plata){
		dinero += plata;
	}
	
	public static void limpiar(int lineas){
		for(int i = 1; i <= lineas; i++){
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {

		int opcion;
		float cuanto = 0;
		
		System.out.print("¿Cuánto dinero desea cargarle a la tarjeta? ");
		dinero = entrada.nextFloat();
		
		do{
			TarjetaSUBE.limpiar(20);
		
			System.out.println("Saldo actual: " + dinero);
			System.out.println();
		
			System.out.println("--------------------MENÚ--------------------");
			System.out.println("1. Cargar crédito");
			System.out.println("2. Viajar");
			System.out.println("3. Salir");
			System.out.println("--------------------------------------------");
			System.out.println();
		
			opcion = entrada.nextInt();
		
			switch(opcion){
			case 1:
				TarjetaSUBE.limpiar(20);
				System.out.println("Saldo actual: " + dinero);
				System.out.println();
				System.out.print("¿Cuánto dinero desea cargar? ");
				cuanto = entrada.nextFloat();
				TarjetaSUBE.cargarCredito(cuanto);
				break;
			case 2:
				TarjetaSUBE.limpiar(20);
				
				System.out.println("Saldo actual: " + dinero);
				System.out.println();
				
				System.out.println("--------------------MENÚ--------------------");
				System.out.println("1. Colectivo ($6)");
				System.out.println("2. Subte ($7,50)");
				System.out.println("3. Tren ($5)");
				System.out.println("--------------------------------------------");
				System.out.println();
				System.out.print("¿En qué transporte desea viajar? ");
				transporte = entrada.nextInt();
				if(TarjetaSUBE.elegirTransporte(transporte) == -1){
					System.out.println();
					System.out.print("Ingrese un transporte válido.");
				}else{
					if(dinero - TarjetaSUBE.elegirTransporte(transporte) >= 0){
						dinero -= TarjetaSUBE.elegirTransporte(transporte);
					}else{
					System.out.println();
					System.out.print("No dispone de suficiente saldo.");
					Thread.sleep(3000);
					}
				}
				break;
			case 3:
				break;
			default:
				TarjetaSUBE.limpiar(20);
				System.out.println("Ingrese una opción válida.");
				break;
			}
		}while(opcion != 3);
	
		entrada.close();
		
	}
	
}
