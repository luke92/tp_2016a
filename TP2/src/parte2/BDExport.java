package parte2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BDExport
{
	public enum Formato {
		CSV,
		JSON,
	}

	/**
	 * Exporta una serie de objetos de la base de datos a un archivo.
	 *
	 * Recibe el nombre del archivo, el formato deseado (CSV o JSON), y
	 * la lista de objetos (Empeados o Clientes).
	 *
	 * ESTE ES EL MÉTODO QUE SE DEBE REFACTORIZAR SIGUIENDO LAS
	 * INSTRUCCIONES DE LA CONSIGNA.
	 */
	public static void export(String archivo, Formato formato, List<?> objetos) {
		Path path = Paths.get(archivo);

		try (BufferedWriter file = Files.newBufferedWriter(path,
		                                                   StandardCharsets.UTF_8)) {
			boolean seenFirst = false;
			PrintWriter printer = new PrintWriter(file);

			for (Object obj : objetos) {
				// Para cada objeto, obtener sus atributos.
				Atributos attrs = new Atributos();

				if (obj instanceof Cliente) {
					Cliente c = (Cliente) obj;  // Cast.
					attrs.put("nombre", c.getNombre());
					attrs.put("cuit", c.getCuit());
					attrs.put("categoria", c.getCategoria().toString());
				}
				else if (obj instanceof Empleado) {
					Empleado e = (Empleado) obj;  // Cast.
					attrs.put("nombre", e.getNombre());
					attrs.put("cuil", e.getCuil());
					attrs.put("salario", String.valueOf(e.getSalario()));
				}
				else {
					continue;
				}

				// Hay que escribir la cabecera de CSV antes de empezar.
				if (!seenFirst && formato == Formato.CSV) {
					seenFirst = true;
					for (String columna : attrs.keySet()) {
						printer.print(columna + ",");
					}
					printer.println();
				}

				// Imprimir la línea con los atributos.
				switch (formato) {
					case CSV:
						for (String val : attrs.values()) {
							printer.print(val + ",");
						}
						printer.println();
						break;
					case JSON:
						if (!seenFirst) {
							// Hay que escribir la apertura del arreglo.
							seenFirst = true;
							printer.print("[ ");
						}
						else {
							// Si no, la coma de separación.
							printer.print(", ");
						}
						printer.print("{");
						for (String k : attrs.keySet()) {
							printer.print(" \"" + k + "\": \"" + attrs.get(k)
							                + ", ");
						}
						printer.println("}");
						break;
				}
			}
			if (formato == Formato.JSON) {
				printer.println("]");
			}
		} catch (IOException e) {
			System.err.println("No se pudo realizar la copia");
		}
	}
}
