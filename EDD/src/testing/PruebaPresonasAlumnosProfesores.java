package testing;

import java.util.Scanner;

public class PruebaPresonasAlumnosProfesores 
{
	public static void main(String[] args) 
	{
		
			Scanner teclado = new Scanner(System.in);
			String cadena;
			int num;
			System.out.println("Introducimos un número: ");
			num = teclado.nextInt();
			
			System.out.println("Introducimos una cadena: ");
			cadena = teclado.nextLine();
			Integer.parseInt(cadena);
			
//			Profesor[] arrayProfesores = new Profesor[5];
//			Alumno[] arrayAlumnos = new Alumno[5];
//			
//			for (int i = 0; i < arrayProfesores.length; i++) 
//			{
//				arrayProfesores[i] = new Profesor();
//				
//			}
//			
//			for (int i = 0; i < arrayProfesores.length; i++) 
//			{
//				System.out.println(arrayProfesores[i].toString());
//			}
//			
//			for (int i = 0; i < arrayAlumnos.length; i++) 
//			{
//					arrayAlumnos[i] = (i <= 2) ? new AlumnoPresencial() 
//											   : new AlumnoLibre() ; //Si i es menor o igual que 2, se crea un alumno presencial
//												//en caso contrario se creará un alumno libre.
//			}
//			
//			
//			for (int i = 0; i < arrayAlumnos.length; i++) 
//			{
//				System.out.println(arrayAlumnos[i].toString());
//			}
	}

}
