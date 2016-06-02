package parte2;

/**
 * Una clase de ejemplo con varios atributos.
 */
public class Cliente
{
	public enum Categoria {
		NORMAL,
		VIP,
	}

	private String nombre;
	private String cuit;
	private Categoria categoria;

	public Cliente(String nombre, String cuit, Categoria categoria) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public Categoria getCategoria() {
		return categoria;
	}
}
