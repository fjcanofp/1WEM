package depuracion;

public class Contador //Cabecera
{  //Cuerpo
	
	//Atributos
	private int resultado;

	//M�todos
	
	//Constructor por defecto
	public Contador()
	{
		
		this.resultado = 0;
	}

	//Constructor por par�metros
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
	public void contar() //cabecera del m�todo 
	{//cuerpo del m�todo
		for (int i = 0; i < 1000; i++) 
		{
			resultado += i +1; 
		}
	}
	
	public void contar(int cantidad) //cabecera del m�todo 
	{//cuerpo del m�todo
		int i; //Declaraci�n
		
		i = 0; //Instanciaci�n, asignaci�n
		while(resultado < cantidad)
		{
			resultado += i +1;// resultado = resultado + i + 1;
			i++;
		}

	}
}
