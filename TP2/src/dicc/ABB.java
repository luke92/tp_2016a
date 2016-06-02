package dicc;

public class ABB<K extends Comparable<K>, V> extends ArbolBinario<K, V>
{
	@Override
	protected Nodo guardar(Nodo p, Nodo nuevo) {
		return null;
	}

	@Override
	protected V obtener(Nodo p, K clave) {
		return null;
	}

	@Override
	protected boolean pertenece(Nodo p, K clave) {
		return false;
	}

	@Override
	protected Nodo eliminar(Nodo p, K clave) {
		return null;
	}
}
