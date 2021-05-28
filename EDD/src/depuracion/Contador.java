package depuracion;

public class Contador //Cabecera
{  //Cuerpo
	
	//Atributos
	private int resultado;

	//Métodos
	
	//Constructor por defecto
	public Contador()
	{
		
		this.resultado = 0;
	}

	//Constructor por parámetros
	public Contador(int resultado)
	{
		this.resultado = resultado;
	}

	//Constructor por copia
	public Contador(Contador c)
	{
		this.resultado = c.getResultado();
	}


	public int getResultado() 
	{
		return resultado; 
	}
	public void contar() //cabecera del método 
	{//cuerpo del método
		for (int i = 0; i < 1000; i++) 
		{
			resultado += i +1; 
		}
	}
	
	public void contar(int cantidad) //cabecera del método 
	{//cuerpo del método
		int i; //Declaración
		
		i = 0; //Instanciación, asignación
		while(resultado < cantidad)
		{
			resultado += i +1;// resultado = resultado + i + 1;
			i++;
		}

	}
}
