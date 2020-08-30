package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> compras = new ArrayList<>();

		compras.add("Macarrão");
		compras.add("Feijao");
		compras.add("Arroz");
		compras.add("Ovo");
		compras.add("Sal");

		Collections.sort(compras);
		
		System.out.println(compras);

		for (String item : compras) {
			System.out.println("Item: " + item);
		}

		for (int i = 0; i < compras.size(); i++) {
			String item = compras.get(i);
			System.out.println(item);
		}

		compras.remove(0);

		System.out.println(compras);

		compras.remove("Ovo");

		System.out.println(compras);

		System.out.println(compras.contains("Arroz"));

		int posFeijao = compras.indexOf("Feijao");
		System.out.println("Posição do Feijão " + posFeijao);

		int posFarinha = compras.indexOf("Farinha");
		System.out.println("Posição da Farinha " + posFarinha);

	}

}
