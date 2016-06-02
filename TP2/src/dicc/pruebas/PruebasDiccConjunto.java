package dicc.pruebas;

import dicc.DiccConjunto;
import dicc.Diccionario;

public class PruebasDiccConjunto extends PruebasBase
{
	@Override
	protected Diccionario<String, Object> crearDiccionario() {
		return new DiccConjunto<>();
	}
}
