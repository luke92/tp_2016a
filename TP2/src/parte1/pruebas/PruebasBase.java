package parte1.pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import parte1.Diccionario;

public abstract class PruebasBase
{
	private Diccionario<String, Object> dicc;

	@Before
	public void setUp() {
		dicc = crearDiccionario();
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

	/**
	 * Devuelve un Diccionario a probar. Las clases de tests hijas
	 * deciden qué implementación usar.
	 */
	protected abstract Diccionario<String, Object> crearDiccionario();
}
