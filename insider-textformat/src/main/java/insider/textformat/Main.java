package insider.textformat;

import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		List<Produto> produtos = List.of(
				new Produto(1,"Copo",3.41),
				new Produto(2,"Caneca",3.33),
				new Produto(3,"Prato",3.7)
				);
		
		for(Produto p : produtos) {
			System.out.format(new Locale("pt","BR"),"%04d\t%-20s\t%.2f%n", p.getId(),p.getNome(),p.getPreco());
		}
	
		double preco = 1356.70;
		String precoStr =  String.format("%.2f", preco);
		System.out.println(precoStr);
	}
	
}
