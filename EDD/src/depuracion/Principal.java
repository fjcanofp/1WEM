package depuracion;

public class Principal 
{

	public static void main(String[] args) 
	{
		Contador c = new Contador();
		System.out.println("Antes de entrar en el m�todo "+c.getResultado());
		//c.contar();
		System.out.println("Despu�s de entrar en el m�todo "+c.getResultado());
		System.out.println("Vamos a contar: moodle " + c.getResultado());
		
		System.out.println("Antes de entrar en el m�todo "+c.getResultado());
		c.contar(1000);
		System.out.println("Despu�s de entrar en el m�todo "+c.getResultado());
	}

}
