package testing;

public abstract class Alumno extends Persona
{



	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	private int curso;
	private String nivelAcademico;
	
	public void cambiarcurso(int curso)
	{
		this.curso = ((int) Math.random() * curso);
	}
	
	public String toString()
	{
		return super.toString()+" curso: "+this.curso+" nivel académico: "+this.nivelAcademico;
	}
	public abstract double pagoMensual();
	public abstract String	mostrarAsignaturas();

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getNivelAcademico() {
		return nivelAcademico;
	}

	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

}
