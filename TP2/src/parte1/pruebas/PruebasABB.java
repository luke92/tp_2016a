package parte1.pruebas;

import parte1.ABB;
import parte1.Diccionario;

public class PruebasABB extends PruebasBase
{
	@Override
	protected Diccionario<String, Object> crearDiccionario() {
		return new ABB<>();
	}
}
