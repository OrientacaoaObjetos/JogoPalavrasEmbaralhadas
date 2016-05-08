public class FabricaMecanicaDoJogo  {
	
	public MecanicaDoJogo mecanicaDoJogo(Boolean tentativas) {
		
		if (tentativas) {
			return new JogoComTentativas();
		} else {
			return new JogoSemTentativas();
		}
	}
}
