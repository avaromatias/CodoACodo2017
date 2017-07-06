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
			
			System.out.println("--------------------PRODUCTOS--------------------");
			System.out.println("1.  Tijera ($25)");
			System.out.println("2.  Marcador ($20)");
			System.out.println("3.  Lapicera ($15)");
			System.out.println("4.  Pluma ($50)");
			System.out.println("5.  Carpeta ($35)");
			System.out.println("6.  Cuaderno ($30)");
			System.out.println("7.  Lapiz ($10)");
			System.out.println("8.  Liquid paper ($35)");
			System.out.println("9.  Goma ($10)");
			System.out.println("10. Regla ($35)");
			System.out.println("-------------------------------------------------");
			System.out.println();
			System.out.println("Dinero disponible: " + dinero);
			System.out.println();
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
				System.out.println();
				System.out.print("No tiene dinero suficiente.");
				Thread.sleep(3000);
				producto = 0;
			}
			
		}while(producto != 0);
		
		Libreria.limpiar(20);
		
		System.out.print("Su vuelto: " + dinero);
		
	}

}