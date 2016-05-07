
public interface MecanicaDoJogo {
	
	boolean jogoAcabou(String palavraCorreta, String palavraJogador);
	
	boolean jogadorAcertouPalavra(String palavraCorreta, String palavraJogador);
	
	boolean jogadorPodeAcertarPalavraNovamente();
	
	Double pontuacaoFinalJogador(String palavraCorreta, String palavraJogador);

}
