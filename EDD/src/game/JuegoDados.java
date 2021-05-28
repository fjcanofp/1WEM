package game;
public class JuegoDados 
{

	    private Dado dado1,dado2,dado3;
	    public JuegoDados() 
	    {
	        dado1=new Dado();
	        dado2=new Dado();
	        dado3=new Dado();        	
	    }

	    public boolean jugar() 
	    {
	        dado1.tirar();
	        dado1.imprimir();
	        dado2.tirar();
	        dado2.imprimir();
	        dado3.tirar();
	        dado3.imprimir();
//	        if (dado1.getValor()==dado2.getValor() && dado1.getValor()==dado3.getValor()) 
//	            return true;
//	        else 
//	            return false;
	        return (dado1.getValor()==dado2.getValor() && dado1.getValor()==dado3.getValor());
	        }        	
	    }