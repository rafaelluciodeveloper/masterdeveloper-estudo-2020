package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Não garante ordem pela ordem de insercao
		Set<Integer> numeros = new HashSet<>();
		
		//Garante a ordem pela ordem de insercao
		Set<Integer> numeros2 = new LinkedHashSet();
		
		numeros.add(1);
		numeros.add(5);
		numeros.add(10);
		numeros.add(22);
		numeros.add(48);
		
		
		numeros2.add(1);
		numeros2.add(5);
		numeros2.add(3);
		numeros2.add(4);
		
		System.out.println("HashSet");
		for(int n : numeros) {
			System.out.println("=> " + n);
		}
		
		System.out.println("LinkedHashSet");
		for(int n : numeros2) {
			System.out.println("=> " + n);
		}
		
		
		//Exemplo Implementacao equals e hashcode
		
		System.out.println("Exemplo equals e hashcode");
		Set<Mes> meses = new HashSet<>();
		
		meses.add(new Mes("Janeiro",1));
		meses.add(new Mes("Fevereiro",2));
		meses.add(new Mes("Março",3));
		meses.add(new Mes("Abril",4));
		meses.add(new Mes("Abril",4));
		
		System.out.println(meses);
		
	}

}
