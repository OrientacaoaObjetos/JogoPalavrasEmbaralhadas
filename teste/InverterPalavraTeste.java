import static org.junit.Assert.*;

import org.junit.Test;

public class InverterPalavraTeste {

	@Test
	public void embaralharPalavrasInverter() {
		String palavra = "teclado";
		Embaralhador embaralhador = new InverterPalavra();
		assertEquals("odalcet", embaralhador.embaralharPalavras(palavra));
	}
}
