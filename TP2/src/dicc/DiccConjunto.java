package dicc;

public class DiccConjunto<K extends Comparable<K>, V> implements Diccionario<K, V>
{
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
}
