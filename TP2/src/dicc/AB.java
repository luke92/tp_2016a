package dicc;

/**
 * Clase base para árboles binarios.
 *
 * Contiene el nodo raíz, y delega todas las operaciones
 * específicas (inserción, búsqueda, borrado) a las clases hijas.
 *
 * Implementa algunos métodos genéricos de AB, como tamaño() e
 * inorder().
 */
abstract class AB<K, V> implements Diccionario<K, V>
{
	/*
	 * Clase Nodo, ya específica de los tipos K y V.
	 *
	 * Tiene visibilidad "default" para que ABB pueda acceder a
	 * los miembros del Nodo sin necesidad de getters.
	 *
	 * La clave es "final" pues no debería ser cambiada una vez
	 * creado el nodo.
	 */
	class Nodo
	{
		K clave;
		V valor;
		Nodo izq, der;

		Nodo(K clave, V valor) {
			this.clave = clave;
			this.valor = valor;
		}
	}

	private Nodo raiz;  // Las clases hijas pueden implementarse
	                    // sin acceso a la raíz.

	/*
	 * Inserción.
	 */

	@Override
	public void guardar(K k, V v) {
		raiz = guardar(raiz, new Nodo(k, v));
	}

	protected abstract Nodo guardar(Nodo padre, Nodo hijo);

	/*
	 * Borrado.
	 */

	@Override
	public void eliminar(K k) {
		raiz = eliminar(raiz, k);
	}

	protected abstract Nodo eliminar(Nodo padre, K clave);

	/*
	 * Búsqueda.
	 */

	@Override
	public V obtener(K k) {
		return obtener(raiz, k);
	}

	@Override
	public boolean pertenece(K k) {
		return pertenece(raiz, k);
	}

	protected abstract V obtener(Nodo padre, K k);

	protected abstract boolean pertenece(Nodo padre, K k);

	/*
	 * Tamaño, O(n). ???
	 */

	public int tamaño() {
		return tamaño(raiz);
	}

	private int tamaño(Nodo nodo) {
		if (nodo == null)
			return 0;
		else
			return 1 + tamaño(nodo.izq) + tamaño(nodo.der);
	}
}
