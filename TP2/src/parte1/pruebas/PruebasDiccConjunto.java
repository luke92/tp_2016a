package parte1.pruebas;

import parte1.DiccConjunto;
import parte1.Diccionario;

public class PruebasDiccConjunto extends PruebasBase
{
	@Override
	protected Diccionario<String, Object> crearDiccionario() {
		return new DiccConjunto<>();
	}
}
