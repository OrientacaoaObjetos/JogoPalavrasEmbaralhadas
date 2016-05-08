import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDePalavras {
	
	private String palavraSorteada;
	
	private List<String> listaPalavras() throws IOException {
		
		List<String> lista = new ArrayList<>();
		
		FileInputStream stream = new FileInputStream("palavras");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while(linha != null) {
			lista.add(linha);
			linha = br.readLine();
		}
		
		return lista;
		
	}
	
	public void sortearPalavra() {
		try {
			List<String> lista = listaPalavras();
			Collections.shuffle(lista);
			this.palavraSorteada = lista.get(0);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public String getPalavraSorteada() {
		return palavraSorteada;
	}
}
