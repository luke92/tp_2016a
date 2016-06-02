package parte1;

/**
 * Interfaz de diccionario pública que se implementa en este
 * paquete.
 */
public interface Diccionario<K, V>
{
	/**
	 * Guarda un valor en el diccionario, asociado con una
	 * determinada clave.
	 *
	 * La clave debe ser un objeto mutable que implemente la
	 * interfaz Comparable.
	 *
	 * El valor puede ser cualquier objeto, incluido "null".
	 */
	void guardar(K clave, V valor);

	/**
	 * Obtiene el valor asociado con una determinada clave.
	 *
	 * @return El objeto asociado con la clave, o "null" si la
	 *         clave no existe en el diccionario.
	 */
	V obtener(K clave);

	/**
	 * Devuelve "true" si la clave se encuentra en el diccionario,
	 * caso contrario devuelve "false".
	 *
	 * NOTA: pertenece(k) devuelve "true" si la clave está en el
	 * diccionario, incluso si su valor asociado es "null".
	 */
	boolean pertenece(K clave);

	/**
	 * Elimina un elemento del diccionario. No hace nada si la
	 * clave no existe.
	 */
	void eliminar(K clave);

	/**
	 * Devuelve el número de elementos actualmente almacenados en
	 * el diccionario.
	 */
	int tamaño();
}
