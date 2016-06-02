package dicc;

import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Clase Conjunto proporcionada por la cátedra.
 *
 * Esta clase se debe usar para implementar DiccConjunto.
 *
 * NO se pueden realizar cambios en esta clase.
 */
final class Conjunto<T extends Comparable<? super T>>
{
	private NavigableSet<T> elementos;

	Conjunto() {
		elementos = new TreeSet<>();
	}

	void agregar(T elem) {
		elementos.add(elem);
	}

	T recuperar(T elem) {
		T found = elementos.ceiling(elem);
		if (Objects.equals(found, elem))
			return found;
		return null;
	}

	boolean pertenece(T elem) {
		return elementos.contains(elem);
	}

	void quitar(T elem) {
		elementos.remove(elem);
	}
}
