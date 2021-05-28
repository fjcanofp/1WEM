package testing;


public class AlumnoPresencial extends Alumno
{
	public AlumnoPresencial(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	private int matriculaCurso;
	private int noConvocatoria;
	private int plusPorConvocatoria;
	
	@Override
	public double pagoMensual() 
	{
		return (this.matriculaCurso+this.plusPorConvocatoria*this.noConvocatoria/12);
	}
	@Override
	public String mostrarAsignaturas() 
	{
		return "Todas las asignaturas del curso "+this.matriculaCurso;
	}

}
