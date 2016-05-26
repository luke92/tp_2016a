package dicc;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Clase Conjunto proporcionada por la cátedra.
 *
 * Esta clase se debe usar para implementar DiccConjunto.
 *
 * NO se pueden realizar cambios en esta clase.
 */
final class Conjunto<T>
{
	private SortedMap<T, T> elementos;

	Conjunto() {
		elementos = new TreeMap<>();
	}

	void agregar(T elem) {
		elementos.put(elem, elem);
	}

	T recuperar(T elem) {
		return elementos.get(elem);
	}

	boolean pertenece(T elem) {
		return elementos.containsKey(elem);
	}

	void quitar(T elem) {
		elementos.remove(elem);
	}
}
