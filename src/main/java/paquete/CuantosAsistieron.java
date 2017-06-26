/* Un profesor, llamémoslo "Mati", se cansó de tomar lista en su curso para saber cuántos alumnos estuvieron presentes en la clase. Queremos ayudarlo de la siguiente forma: se pide ingresar el nombre de los alumnos que asistieron ese día. El programa dejará de pedir nombres cuando se escriba la palabra "fin". Informar por pantalla cuántos alumnos asistieron ese día. */

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
