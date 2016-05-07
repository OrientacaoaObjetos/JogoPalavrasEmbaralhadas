
public class InverterPalavra implements Embaralhador {

	@Override
	public String embaralharPalavras(String palavra) {
		return new StringBuilder(palavra).reverse().toString();
	}
}
