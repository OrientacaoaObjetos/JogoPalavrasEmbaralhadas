import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabricaEmbaralhadores {
	
	public Embaralhador embaralhadorAleatorio() {
		
		List<Embaralhador> list = new ArrayList<>();
		list.add(new InverterPalavra());
		list.add(new RandomPalavra());
		
		Collections.shuffle(list);
		
		return list.get(0);
	}
}
