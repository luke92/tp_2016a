package parte2;

import java.util.Arrays;
import java.util.List;

import parte2.BDExport.Formato;
import parte2.Cliente.Categoria;

public class Main
{
	/**
	 * Ejemplo de uso de BDExport.export().
	 *
	 * Crea unos cuantos clientes y empleados, y le pide a la case
	 * BDExport que los exporte.
	 */
	public static void main(String[] args) {
		BDExport.export("clientes.csv", Formato.CSV, clientesFicticios());
		BDExport.export("empleados.json", Formato.JSON, empleadosFicticios());
	}

	/*
	 * Métodos auxiliares para tener algo que guardar.
	 */
	private static List<Cliente> clientesFicticios() {
		return Arrays.asList(new Cliente("C1", "T1", Categoria.VIP),
		                     new Cliente("C2", "T2", Categoria.NORMAL));
	}

	private static List<Empleado> empleadosFicticios() {
		return Arrays.asList(new Empleado("E1", "L1", 100),
		                     new Empleado("E2", "L2", 200));
	}
}
