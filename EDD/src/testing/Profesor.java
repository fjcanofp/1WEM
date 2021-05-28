package testing;

public class Profesor extends Persona
{
	public Profesor(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	private String asignatura;

	@Override
	public String toString() 
	{
	
		return super.toString()+" asignatura: "+this.asignatura;
	}
	
}
