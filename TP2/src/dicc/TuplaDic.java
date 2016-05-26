package dicc;

class TuplaDic<T1 extends Comparable<T1>, T2> implements Comparable<TuplaDic<T1, T2>>
{
	TuplaDic(T1 x, T2 y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public int compareTo(TuplaDic<T1, T2> tupla) {
		return 0;
	}

	// Las variables de instancia tienen visibilidad interna,
	// por lo tanto no hace falta implementar getter/setters.

	final T1 x;  // No se puede modificar una vez creada la tupla.
	T2 y;        // El segundo (el valor) sí puede ser modificado.
}
