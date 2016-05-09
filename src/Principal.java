import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
		Embaralhador embaralhador = fabricaEmbaralhadores.embaralhadorAleatorio();
		BancoDePalavras banco = new BancoDePalavras();
		String palavraJogador = "";
		
		System.out.println("------Game Jogo Palavras Embaralhadas-------");
		System.out.println("Bem vindo Jogador(a)!!!");
		System.out.println("\nEscolha seu modo de jogo: (0)Modo Fácil (1)Modo Difícil (2) Sair");
		
		Scanner in = new Scanner(System.in);
		String opcao = in.nextLine();
		
		while (!opcao.equals("2")) {
			
			if (opcao.equals("0")) {
				MecanicaDoJogo jogo = fabrica.mecanicaDoJogo(Boolean.TRUE);
				String palavraEmbaralhada = embaralhador.embaralharPalavras(banco.getPalavraSorteada());
				String continuar = "1";
				
				while (jogo.jogadorPodeAcertarPalavraNovamente() && continuar.equals("1")) {
					System.out.println("Qual é a palavra:");
					System.out.println(palavraEmbaralhada);
					
					in = new Scanner(System.in);
					palavraJogador = in.nextLine();
					if (jogo.jogoAcabou(banco.getPalavraSorteada(), palavraJogador)) {
						System.out.println("\n\nParabéns você acertou a palavra!!!");
						continuar = "0";
					} else {
						System.out.println("Palvra informada está incorreta.");
						System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
						System.out.println("\n(1) Continuar (0) Sair ");
						continuar = in.nextLine();
					}
				}
				
				if (jogo.jogadorAcertouPalavra(banco.getPalavraSorteada(), palavraJogador)) {
					System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
				} else {
					System.out.println("Game Over!!!");
				}
				
			} else  {
				
				MecanicaDoJogo jogo = fabrica.mecanicaDoJogo(Boolean.FALSE);
				String palavraEmbaralhada = embaralhador.embaralharPalavras(banco.getPalavraSorteada());
				
				System.out.println("Qual é a palavra:");
				System.out.println(palavraEmbaralhada);
				
				in = new Scanner(System.in);
				palavraJogador = in.nextLine();
				
				if (jogo.jogoAcabou(banco.getPalavraSorteada(), palavraJogador)) {
					System.out.println("\n\nParabéns você acertou a palavra!!!");
					System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
				} else {
					System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
					System.out.println("Game Over!!!");
				}
			}
			
			System.out.println("\n\nBem vindo Jogador(a)!!!");
			System.out.println("\nEscolha seu modo de jogo: (0)Modo Fácil (1)Modo Difícil (2)Sair");
			banco = new BancoDePalavras();
			in = new Scanner(System.in);
			opcao = in.nextLine(); 
		}
		
		System.out.println("------Game Jogo Palavras Embaralhadas-------");
		System.out.println("Desenvolvido por: Emanuel Rocha Melechco");
	}
}
