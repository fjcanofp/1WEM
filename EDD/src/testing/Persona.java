package testing;

public class Persona 
{

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//Atributos
	private String nombre;
	private int edad;
	
	public void cambiarEdad(int edad)
	{
		edad = edad;
	}
	
	public String toString() 
	{

		return ("Nombre: "+this.nombre+" edad: "+this.edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
