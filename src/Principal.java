import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Bem vindo Jogador(a)!!!");
		System.out.println("Escolha seu modo de jogo: (0)Modo Fácil (1)Modo Difícil");
		
		Scanner in = new Scanner(System.in);
		
		if (in.nextLine().equals("0")) {
			FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
			MecanicaDoJogo jogo = fabrica.mecanicaDoJogo(Boolean.TRUE);
			
			
			
		} else  {
			
		}
	}

}
