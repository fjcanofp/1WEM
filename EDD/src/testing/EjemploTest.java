package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class EjemploTest
{

	static Persona p;
	static long tiempoInicial;

	@ParameterizedTest
	@DisplayName("Vamos a mostrar otro nombre por pantalla del Test")
	@ValueSource(ints = {-1,2,4} )
	void testCambiarEdadParametrizado(int edad)
	{
		p.cambiarEdad(edad);
		boolean condicion =  p.getEdad() == edad;
		Assertions.assertFalse(condicion, "parametrizado");
		//assertTrue quiere decir que el test será correcto o válido si solo si, la condición devuelve true
	}
	
	
	@Test
	void testPersonasNotNull() 
	{
		Persona[] array;
		array = new Persona[10];
		
		array[0] = new Persona("Ejemplo no nulo",0);
		
		Assertions.assertNotNull(array[0], "¿Será nula?");
	}
	
	@Test
	void testPersonasNull() 
	{
		Persona[] array;
		array = new Persona[10];
		
		Assertions.assertNull(array[0], "¿Será nula?");
	}
	
	@Test
	void testPersonasSame()
	{
		Persona aux = p;
		Assertions.assertSame(p, aux, "Estamos probando que hemos apuntado a la misma dirección de memoria");
	}
	
	@Test
	void testCambiarEdadTrue()
	{
		p.cambiarEdad(13);
		boolean condicion =  p.getEdad() == 13;
		Assertions.assertTrue(condicion, "Para que el método cambiarEdad sea correcto obtenemos la misma edad");
		//assertTrue quiere decir que el test será correcto o válido si solo si, la condición devuelve true
	}
	
	@Test
	void testCambiarEdadFalse()
	{
		p.cambiarEdad(13);
		boolean condicion =  p.getEdad() == 13;
		Assertions.assertFalse(condicion, "Para que el método cambiarEdad sea correcto obtenemos la misma edad");
		//assertFalse quiere decir que el test será correcto o válido si solo si, la condición devuelve false
	}
	
	@BeforeEach
	void antesDeCadaTest(TestInfo testInformacion)
	{
		System.out.println("Vamos a ejecutar el test: "+testInformacion.getTestMethod().get().getName());
		tiempoInicial = System.currentTimeMillis();
	}
	
	@AfterEach
	void despuésDeCadaTest(TestInfo testInformacion)
	{
		System.out.println("Hemos terminado de ejecutar el test: "+testInformacion.getTestMethod().get().getName());
		System.out.println("El test ha tardado en ejecutarse: "+(System.currentTimeMillis()-tiempoInicial)+" milisegundos");
	}
	
	@BeforeAll
	static void iniciarPersona()
	{
		//Se llama una única vez, al principio del programa
		p = new Persona("Ejemplo", 0);
	}
	

	@AfterAll
	static void liberarPersona()
	{
		//Se llama una única vez, al final del programa
		p = null;
	}
	
	@Disabled
	@Test
	void test() 
	{
		fail("Not yet implemented");
	}

}
