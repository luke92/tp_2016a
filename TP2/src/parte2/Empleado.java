package parte2;

/**
 * Otra clase de ejemplo con varios atributos.
 */
public class Empleado
{
	private String nombre;
	private String cuil;
	private int salario;

	public Empleado(String nombre, String cuil, int salario) {
		this.nombre = nombre;
		this.cuil = cuil;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCuil() {
		return cuil;
	}

	public int getSalario() {
		return salario;
	}
}
