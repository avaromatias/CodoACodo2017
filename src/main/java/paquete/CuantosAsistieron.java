package paquete;

import java.util.Scanner;

public class CuantosAsistieron {

	public static void main(String[] args) {
		
		String nombre = "";
		Scanner entrada = new Scanner(System.in);
		int asistieron = 0;
		
		do{
			
			System.out.println("Ingrese nombre del alumno: ");
			nombre = entrada.next();
			
			if(!(nombre.equals("fin"))){
			asistieron++;
			}
			
		}while(!(nombre.equals("fin")));
		
		System.out.println("Asistieron " + asistieron + " alumnos.");
		
	}

}
