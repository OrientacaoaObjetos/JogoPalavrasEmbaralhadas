import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BancoDePalavras {
	
	public List<String> listaPalavras() throws IOException {
		
		List<String> lista = new ArrayList<>();
		
		FileInputStream stream = new FileInputStream("palavras");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while(linha != null) {
			lista.add(linha);
			linha = br.readLine();
		}
		
		System.out.println(lista);
		
		return lista;
		
	}
	
	public static void main(String[] args) throws IOException {
		BancoDePalavras banco = new BancoDePalavras();
		banco.listaPalavras();
	}
}
