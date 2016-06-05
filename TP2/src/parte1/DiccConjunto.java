package parte1;

public class DiccConjunto<K extends Comparable<K>, V> implements Diccionario<K, V>
{
	/**
	 * Conjunto privado que DiccConjunto usa para almacenar sus parejas
	 * (clave, significado).
	 */
	private Conjunto<TuplaDic<K, V>> elementos;

	public DiccConjunto() {
		elementos = new Conjunto<>();
	}

	@Override
	public void guardar(K clave, V valor) {
	}

	@Override
	public V obtener(K clave) {
		return null;
	}

	@Override
	public boolean pertenece(K clave) {
		return false;
	}

	@Override
	public void eliminar(K clave) {
	}

	@Override
	public int tamaño() {
		return -1;
	}
}
