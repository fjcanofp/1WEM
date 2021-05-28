package testing;


public class AlumnoLibre extends Alumno
{


	public AlumnoLibre(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	private String[] listaAsignaturas;
	private float precioPorHora;
	private int noHorasDiarias;
	
	
//	public AlumnoLibre() 
//	{
//		this.precioPorHora = (float) Math.random() * 10;
//	}
	public void pedirAsignaturas( String[] asignaturas)
	{
		listaAsignaturas = new String[asignaturas.length];
		for (int i = 0; i < asignaturas.length; i++) 
		{
			listaAsignaturas[i] = new String(asignaturas[i]);
		}
	}
	public double pagoMensual()
	{
		return this.precioPorHora*this.noHorasDiarias+30;
	}
	public String mostrarAsignaturas()
	{
		String asignaturas = "";
		for (int i = 0; i < listaAsignaturas.length; i++) 
		{
			asignaturas += listaAsignaturas[i];
		}
		return asignaturas;
	}
	
}
