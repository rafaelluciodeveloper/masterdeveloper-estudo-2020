package logica.prioridadeoperadores;

public class Main {

	public static void main(String[] args) {
			boolean v = false;
			boolean x = 5 * 3 + Math.sqrt(7 * 7 ) <= 100 || !v && v;
			System.out.println(x);
	}

}
