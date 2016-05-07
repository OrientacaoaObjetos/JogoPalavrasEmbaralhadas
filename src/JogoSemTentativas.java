public class JogoSemTentativas implements MecanicaDoJogo{

	@Override
	public boolean jogoAcabou(String palavraCorreta, String palavraJogador) {
		if (jogadorAcertouPalavra(palavraCorreta, palavraJogador)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean jogadorAcertouPalavra(String palavraCorreta, String palavraJogador) {
		if (palavraCorreta.toUpperCase().equals(palavraJogador)){
			return true;
		}

		return false;
	}

	@Override
	public boolean jogadorPodeAcertarPalavraNovamente() {
		return false;
	}

	@Override
	public Double pontuacaoFinalJogador(String palavraCorreta, String palavraJogador) {
		
		Double pontuacaoFinal = 0d;
		Double pontuacaoPorPalavra = 100d / palavraCorreta.length();
		
		char[] charPalavraCorreta = palavraCorreta.toCharArray();
		char[] charPalavraJogador = palavraJogador.toCharArray();
		int i = 0;

		for (char c:  charPalavraCorreta){
			if (c == charPalavraJogador[i]){
				pontuacaoFinal += pontuacaoPorPalavra;
			}
		}
		
		return pontuacaoFinal;
	}
}
