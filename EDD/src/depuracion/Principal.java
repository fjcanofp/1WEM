package depuracion;

public class Principal 
{

	public static void main(String[] args) 
	{
		Contador c = new Contador();
		System.out.println("Antes de entrar en el método "+c.getResultado());
		//c.contar();
		System.out.println("Después de entrar en el método "+c.getResultado());
		System.out.println("Vamos a contar: moodle " + c.getResultado());
		
		System.out.println("Antes de entrar en el método "+c.getResultado());
		c.contar(1000);
		System.out.println("Después de entrar en el método "+c.getResultado());
	}

}
