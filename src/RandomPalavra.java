import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPalavra implements Embaralhador {

	@Override
	public String embaralharPalavras(String palavra) {
		char[] caracteres = palavra.toCharArray();
		List<Character> ocharaters  = new ArrayList<Character>(caracteres.length);
		for (char c:  caracteres ){
		  ocharaters.add(c); 
		}
		Collections.shuffle(ocharaters);
		
		for ( int i =0; i < caracteres.length ; i++ ){
		     caracteres[i] = ocharaters.get(i); 
		}
		
		return new String(caracteres);
	}
}
