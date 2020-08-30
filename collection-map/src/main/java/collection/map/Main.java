package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] artgs) {
		Map<Integer, String> meses = new HashMap<>();

		meses.put(1, "Janeiro");
		meses.put(3, "Março");
		meses.put(6, "Junho");
		meses.put(2, "Fevereiro");

		System.out.println(meses);
		
		String m1 = meses.get(1);
		System.out.println(m1);
		
		//Pegar Chaves
		Set<Integer> numeros = meses.keySet();
		System.out.println(numeros);
		
		//Pegar Valores
		Collection<String> nomes =  meses.values();
		System.out.println(nomes);
		
		//Pegar Conjunto Chave Valores
		Set<Map.Entry<Integer, String>> entries = meses.entrySet();
		
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
