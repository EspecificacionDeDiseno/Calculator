import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	
	private Calculadora calculadora;
	
	public void escenario() {
		calculadora = new Calculadora();
	}
	
	public void testsumar() {
		escenario();
		assertTrue(calculadora.sumar(2, 2)==(2+2));
	}
	
	public void testrestar() {
		escenario();
		assertFalse(calculadora.restar(8, 2)==(2-2));
	}
	
	public void testmultiplicar() {
		escenario();
		assertTrue(calculadora.multiplicar(10, 8)==(10*8));
	}
	
	public void testdividir() {
		escenario();
		assertTrue(calculadora.dividir(2, 2)==(2/2));
	}

}
