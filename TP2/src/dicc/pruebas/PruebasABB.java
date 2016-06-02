package dicc.pruebas;

import dicc.ABB;
import dicc.Diccionario;

public class PruebasABB extends PruebasBase
{
	@Override
	protected Diccionario<String, Object> crearDiccionario() {
		return new ABB<>();
	}
}
