package estructurado;

import java.util.Scanner;

public class Libreria {
	
	static int dinero = 0;
	static Scanner entrada = new Scanner(System.in);
	
	public static void limpiar(int lineas){
		for(int i = 1; i <= lineas; i++){
			System.out.println();
		}
	}
	
	public static void cobrar(int plata){
		dinero -= plata;
	}
	
	public static int precios(int producto){
		switch(producto){
		case 0:
			return 0;
		case 1:
			return 25;
		case 2:
			return 20;
		case 3:
			return 15;
		case 4:
			return 50;
		case 5:
			return 35;
		case 6:
			return 30;
		case 7:
			return 10;
		case 8:
			return 35;
		case 9:
			return 10;
		case 10:
			return 35;
		default:
			return -1;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		String nombre = "";
		int producto = 0;
		
		System.out.print("Ingrese su nombre: ");
		nombre = entrada.next();
		
		Libreria.limpiar(20);
		
		System.out.print("Bienvenid@ " + nombre + ", ¿De cuanto dinero dispone? ");
		dinero = entrada.nextInt();
		
		do{
			
			Libreria.limpiar(20);
			
			System.out.println("Dinero disponible: " + dinero);
			
			System.out.print("¿Qué producto desea comprar? ");
			producto = entrada.nextInt();
			
			if(Libreria.precios(producto) == -1){
				System.out.print("Ingrese un producto valido.");
				Thread.sleep(3000);
				continue;
			}
			
			if(dinero - Libreria.precios(producto) >= 0){
				Libreria.cobrar(Libreria.precios(producto));
			}else{
				System.out.print("No tiene dinero suficiente.");
				Thread.sleep(3000);
				producto = 0;
			}
			
		}while(producto != 0);
		
		Libreria.limpiar(20);
		
		System.out.print("Su vuelto: " + dinero);
		
	}

}