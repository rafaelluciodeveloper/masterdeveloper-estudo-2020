package collection.ordered;

import java.util.Comparator;

public class InverseCompartor implements Comparator<Character> {

	@Override
	public int compare(Character c1, Character c2) {
		return -c1.compareTo(c2);
	}

}
