package collection.ordered;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Character> alfabeto = new TreeSet<>();
		alfabeto.add('F');
		alfabeto.add('A');
		alfabeto.add('C');
		alfabeto.add('F');
		alfabeto.add('D');
		alfabeto.add('B');
		alfabeto.add('E');
		
		System.out.println(alfabeto);
		
		Set<Mes> meses = new TreeSet<>();
		meses.add(new Mes("Janeiro",1));
		meses.add(new Mes("Maio",5));
		meses.add(new Mes("Março",3));
		meses.add(new Mes("Fevereiro",2));
		meses.add(new Mes("Abril",4));
		
		System.out.println(meses);
		
		
		Set<Character> alfabertoInverso = new TreeSet<>(new InverseCompartor());
		
		alfabertoInverso.add('F');
		alfabertoInverso.add('A');
		alfabertoInverso.add('C');
		alfabertoInverso.add('F');
		alfabertoInverso.add('D');
		alfabertoInverso.add('B');
		alfabertoInverso.add('E');
		
		System.out.println(alfabertoInverso);


	}

}
