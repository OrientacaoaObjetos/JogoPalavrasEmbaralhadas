import static org.junit.Assert.*;

import org.junit.Test;

public class RandomPalavraTeste {

	@Test
	public void embaralharPalavrasRandomicadmente() {
		String palavra = "teclado";
		Embaralhador embaralhador = new RandomPalavra();
		assertNotEquals("teclado", embaralhador.embaralharPalavras(palavra));
	}
}
