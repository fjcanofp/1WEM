package game;
import java.util.Scanner;

public class DadosApp 
{

    public static void main(String[] arg)
    {

    	Scanner teclado= new Scanner(System.in);
    	JuegoDados jugador1= new JuegoDados();
    	boolean ganador;
    	char seguir='s';
    	int ac=0,t=0;
    	String cadena;
    	do
    	{
    		ganador= jugador1.jugar();

    		if (ganador)
    		{
    			System.out.println("Ganó");
    			ac++;
    		}
    		else
    		{ 
    			System.out.println("Perdió");
    		}
    		t++;
    		System.out.println("Otra partida (s/n)? ");
    		cadena=teclado.next();
    		seguir=cadena.charAt(0);
    	} while(seguir=='s');
    	
    	System.out.println("Perdió "+(t-ac));
    	System.out.println("Gano"+ac);
    	
    	double r=(double)ac/t*100;
    	
    	System.out.println(r);
	} 
}	   