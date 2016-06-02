package dicc;

public class TuplaDic<T1 extends Comparable<T1>, T2> implements Comparable<TuplaDic<T1, T2>>
{
	private final T1 e1;
	private T2 e2;

	TuplaDic(T1 a, T2 b) {
		e1 = a;
		e2 = b;
	}

	public T1 getE1() {
		return e1;
	}

	public T2 getE2() {
		return e2;
	}

	public void setE2(T2 v) {
		e2 = v;
	}

	/*
	 * IMPLEMENTAR LOS SIGUIENTES MÉTODOS.
	 */

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
}
