package parte1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDicc
{
	private Diccionario<String, Object> dicc;

	@Before
	public void setUp() {
		dicc = new DiccConjunto<>();
	}

	@Test
	public void vacio() {
		assertEquals(0, dicc.tamaño());
		assertNull(dicc.obtener("a"));
		assertFalse(dicc.pertenece("a"));
	}

	@Test
	public void unElemento() {
		Object valor = new Object();
		dicc.guardar("abc", valor);
		assertEquals(1, dicc.tamaño());
		assertTrue(dicc.pertenece("abc"));
		assertEquals(valor, dicc.obtener("abc"));
	}

	@Test
	public void insertarMuchos() {
	}
}
