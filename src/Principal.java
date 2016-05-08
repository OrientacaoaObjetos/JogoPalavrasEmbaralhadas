import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
		Embaralhador embaralhador = fabricaEmbaralhadores.embaralhadorAleatorio();
		BancoDePalavras banco = new BancoDePalavras();
		
		System.out.println("Bem vindo Jogador(a)!!!");
		System.out.println("\nEscolha seu modo de jogo: (0)Modo Fácil (1)Modo Difícil");
		
		Scanner in = new Scanner(System.in);
		
		if (in.nextLine().equals("0")) {
			MecanicaDoJogo jogo = fabrica.mecanicaDoJogo(Boolean.TRUE);
			String palavraEmbaralhada = embaralhador.embaralharPalavras(banco.getPalavraSorteada());
			String continuar = "1";
			
			while (jogo.jogadorPodeAcertarPalavraNovamente() && continuar.equals("1")) {
				System.out.println("Qual é a palavra:");
				System.out.println(palavraEmbaralhada);
				
				in = new Scanner(System.in);
				String palavraJogador = in.nextLine();
				if (jogo.jogoAcabou(banco.getPalavraSorteada(), palavraJogador)) {
					System.out.println("\n\nParabéns você acertou a palavra!!!");
					System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
					continuar = "0";
				} else {
					System.out.println("Palvra informada está incorreta.");
					System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
					System.out.println("\n(1) Continuar (0) Sair ");
					continuar = in.nextLine();
				}
			}
			
		} else  {
			
			MecanicaDoJogo jogo = fabrica.mecanicaDoJogo(Boolean.TRUE);
			String palavraEmbaralhada = embaralhador.embaralharPalavras(banco.getPalavraSorteada());
			
			System.out.println("Qual é a palavra:");
			System.out.println(palavraEmbaralhada);
			
			in = new Scanner(System.in);
			String palavraJogador = in.nextLine();
			
			if (jogo.jogoAcabou(banco.getPalavraSorteada(), palavraJogador)) {
				System.out.println("\n\nParabéns você acertou a palavra!!!");
				System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
			} else {
				System.out.println("A sua pontuação final foi: " + jogo.pontuacaoFinalJogador(banco.getPalavraSorteada(), palavraJogador).intValue());
				System.out.println("Game Over!!!");
			}
		}
	}
}
